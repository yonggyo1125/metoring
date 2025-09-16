package com.sparta.test01;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

public class Test02 {
    @Test
    void test() throws Exception {
        ObjectMapper om = new ObjectMapper();
        Member member = new Member("user01@test.org", "1234");

        /**
         * {"email": "....", "password": "..."}
         */
        String json = om.writeValueAsString(member);
        System.out.println(json);
    }
}
