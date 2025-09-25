package org.sparta.lifecyle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Message implements InitializingBean, DisposableBean {

    public void hello(String name) {
        System.out.printf("%s님 안녕하세요.%n", name);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        // 스프링 컨테이너 내에서 초기화 단계시 실행되는 메서드
        // 객체 완성(의존성 주입까지 완료 된 상태)이후에 처리할 작업
        System.out.println("afterPropertiesSet()");
    }

    @Override
    public void destroy() throws Exception {
        // 컨테이너 소멸 전(빈 객체의 소멸 전)에 호출, 소멸전 정리할 작업이 있는 경우
        System.out.println("destroy()");
    }
}
