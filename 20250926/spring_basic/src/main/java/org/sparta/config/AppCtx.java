package org.sparta.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 스프링 컨테이너가 관리할 객체가 무었인지를 설정하는 클래스
 *
 */
@Configuration
// org.sparta 패키지와 이 하위 패키지 모두 자동 스캔 범위
@ComponentScan("org.sparta")
public class AppCtx {

}
