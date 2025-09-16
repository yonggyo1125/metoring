package com.sparta;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

@SpringBootTest
@AutoConfigureMockMvc
public class Test01 {
    @Autowired
    MockMvc mockMvc;

    @Test
    void test1() throws Exception{
        mockMvc.perform(post("/member/login")
                .contentType(MediaType.APPLICATION_JSON).content("{\"email\": \"user01@test.org\"}"))
                .andDo(print());
    }

    @Test
    void test2() throws Exception{
        mockMvc.perform(post("/member/login")
                        .contentType(MediaType.APPLICATION_JSON).content("{\"email\": \"user01@test.org\"}"))
                .andDo(print());
    }
}
