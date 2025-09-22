package org.sparta.config;

import org.sparta.solid.ocp.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 스프링 컨테이너가 관리할 객체가 무었인지를 설정하는 클래스
 *
 */
@Configuration
public class AppCtx {

    /**
     * 스프링이 생성하고 관리할 객체의 대상이 누구인지 알려주는 애노테이션
     * @return
     */
    @Bean
    public Flyable flyable() {
        System.out.println("flyable");
        return new Flyable();
    }

    @Bean
    public Quackable quackable() {
        System.out.println("quackable");
        return new Quackable();
    }

    @Bean
    public Sleepable sleepable() {
        System.out.println("sleepable");
        return new Sleepable();
    }

    @Bean
    public Mallad mallad() {
        System.out.println("mallad");
        Mallad mallad = new Mallad();
        mallad.setQuackable(quackable());
        mallad.setSleepable(sleepable());
        return mallad;
    }

    @Bean
    public RobotDuck robotDuck() {
        System.out.println("robotDuck");
        return new RobotDuck(flyable(), quackable());
    }
}
