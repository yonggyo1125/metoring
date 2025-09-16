package com.sparta.member.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class LoginRequestDto {
    @Email(message = "이메일 형식이 아닙니다.")
    @NotBlank(message = "이메일을 입력하세요.")
    private String email;

    //@Size(min=8, message = "비밀번호를 8자리 이상 입력하세요.")
    @NotBlank(message = "비밀번호를 입력하세요.")
    private String password;
}
