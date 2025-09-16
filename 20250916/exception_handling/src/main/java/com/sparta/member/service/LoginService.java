package com.sparta.member.service;

import com.sparta.member.MemberNotFoundException;
import com.sparta.member.dto.LoginRequestDto;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    public void process(LoginRequestDto requestDto) {
        // 처리...
        boolean result = true;
        if (!result) { // 어떤 상황에 회원을 조회했는데 없네요? ..
            throw new MemberNotFoundException();
        }
    }
}
