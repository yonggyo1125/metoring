package com.example.demo.test01;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.lang.reflect.Method;

@SpringBootTest
public class Ex01 {

    @Test
    void test1() throws Exception {
        ObjectMapper om = new ObjectMapper();
        Member member = new Member("user01", "user01@test.org");
        // member.getClass() -> 내부에 정의된 getter가 무엇 있는지 확인
        String json = om.writeValueAsString(member); // 자바 객체 -> 조회(getter) -> 문자열
        System.out.println(json);

        /**
         * Member.class : Class 클래스 객체 : 클래스의 명세서
         * ObjectMapper는 범용 라이브러리, JSON의 문자열의 구조나 변환하고자 하는 객체는 다양하므로
         * 어떤 필드가 필요한지 정할수 없음, 클래스에 어떤 구성 요소가 있는지 정로를 알려줘야 하는데
         * Class 클래스 객체를 통해서 클래스에 정의된 getter가 뭔지 setter가 뭔지를 알수 있다.
         */
        // Member.class 객체에서 정의된 setter가 뭔지를 확인, 문자열과 비교해서 값을 설정
        // JSON 문자열 -> 객체 생성(기본생성자), 값 설정(setter) -> 자바 객체 변환
        Member member2 = om.readValue(json, Member.class);
        System.out.println(member2);
        
    }

    @Test
    void test2() throws Exception {
        Class cls = Member.class;
        Object obj = cls.getDeclaredConstructor().newInstance(); // 기본 생성자로 객체 생성
        for (Method method : cls.getDeclaredMethods()) {
            if (!method.getName().startsWith("set")) continue;
            method.invoke(obj, "값");
        }

        // Reflection : 동적 메서드 호출
    }
}
