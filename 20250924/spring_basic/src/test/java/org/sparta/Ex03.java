package org.sparta;

import org.junit.jupiter.api.Test;
import org.sparta.config.AppCtx2;
import org.sparta.lifecyle.Message;
import org.sparta.lifecyle.Message2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Ex03 {

    @Test
    void test1() {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx2.class); // 객체 생성 -> 의존성 주입 -> 초기화
        Message m1 = ctx.getBean(Message.class);
        Message m2 = ctx.getBean(Message.class);
        System.out.println(m1 == m2); // singleton

        Message2 message2 = ctx.getBean(Message2.class);
        Message2 message2_2 = ctx.getBean(Message2.class);
        System.out.println(message2 == message2_2); // prototype
        ctx.close(); // 스프링 컨테이너 소멸
    }

}
