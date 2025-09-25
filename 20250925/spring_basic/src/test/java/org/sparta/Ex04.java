package org.sparta;

import org.junit.jupiter.api.Test;
import org.sparta.proxy.Calculator;
import org.sparta.proxy.ProxyCalculator;
import org.sparta.proxy.RecCalculator;

import java.lang.reflect.Proxy;

public class Ex04 {
    @Test
    void test1() {
        RecCalculator cal = new RecCalculator();
        long result = cal.factorial(10L);

        System.out.println(result);
    }

    @Test
    void test2() {
        Calculator cal = (Calculator) Proxy.newProxyInstance(RecCalculator.class.getClassLoader(), new Class[] {Calculator.class}, new ProxyCalculator(new RecCalculator()));

        long result = cal.factorial(10L);
        System.out.println(result);

        System.out.println(cal instanceof RecCalculator); // false -> RecCalculator 자료형으로 만들어진 객체는 아니다. 상속관계도 아니다!
        // jdk.proxy.proxy8 -> 새롭게 만들어진 클래스, Calculator 인터페이스의 구현 체
        System.out.println(cal instanceof Calculator);

        // 자바의 표준 프록시는 인터페이스 기반!!, 반드시 인터페이스가 있어야 하며, 생성되는 프록시 클래스는 인터페이스의 하위 클래스

    }
}
