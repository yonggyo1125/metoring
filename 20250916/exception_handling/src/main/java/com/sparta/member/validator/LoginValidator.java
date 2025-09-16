package com.sparta.member.validator;

import com.sparta.member.dto.LoginRequestDto;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class LoginValidator implements Validator {
    @Override
    public boolean supports(Class<?> clazz) { // 검증 대상을 한정
        return clazz.isAssignableFrom(LoginRequestDto.class);
    }

    /**
     *
     * @param target : 검증 대상 객체(사용자의 입력 정보가 담겨 있는 객체), 커맨드 객체
     * @param errors : 검증 실패 처리를 위한 메서드가 담겨 있는 객체
     */
    @Override
    public void validate(Object target, Errors errors) {
        if (errors.hasErrors()) {
            return;
        }

        LoginRequestDto requestDto = (LoginRequestDto) target;
        String password = requestDto.getPassword();
        if (password.length() < 8) {
            errors.rejectValue("password", "Size", "비밀번호를 8자리 이상 입력하세요.");
        }
    }
}
