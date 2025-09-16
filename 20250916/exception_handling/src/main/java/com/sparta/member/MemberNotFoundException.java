package com.sparta.member;

import com.sparta.global.CommonException;
import org.springframework.http.HttpStatus;

public class MemberNotFoundException extends CommonException {
    public MemberNotFoundException() {
        super("회원을 찾을 수 없습니다.", HttpStatus.NOT_FOUND);
    }
}
