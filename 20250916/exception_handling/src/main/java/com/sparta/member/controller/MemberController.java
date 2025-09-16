package com.sparta.member.controller;

import com.sparta.BadRequestException;
import com.sparta.member.dto.LoginRequestDto;
import com.sparta.member.service.LoginService;
import com.sparta.member.validator.LoginValidator;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.Collectors;

@Slf4j(topic = "회원")
@RestController
@RequestMapping("/member")
@RequiredArgsConstructor
public class MemberController {

    private final LoginValidator validator;
    private final LoginService loginService;

    // 로그인 처리
    @PostMapping("/login")
    public String login(@Valid @RequestBody LoginRequestDto requestDto, BindingResult errors) {

        validator.validate(requestDto, errors);

        if (errors.hasErrors()) {
            // 검증 실패 정보를 출력하는 처리
           String message = errors.getAllErrors().stream().map(o -> o.getDefaultMessage()).collect(Collectors.joining(","));
           throw new BadRequestException(message);

        }

        // 요청 데이터의 검증 성공 후 로그인 처리@
        loginService.process(requestDto); // MemberNotFoundException...

        return "redirect:/"; // 로그인 성공시 이동
    }

//    @ExceptionHandler(Exception.class)
//    public ResponseEntity<String> errorHandler(Exception e) {
//
//        HttpStatus status = HttpStatus.INTERNAL_SERVER_ERROR;
//        if (e instanceof CommonException commonException) {
//            status = commonException.getStatus();
//        }
//
//        return ResponseEntity.status(status).body(e.getMessage());
//    }

//    @ResponseStatus(HttpStatus.BAD_REQUEST)
//    @ExceptionHandler(MethodArgumentNotValidException.class)
//    public String errorHandler2(MethodArgumentNotValidException e) {
//        return e.getMessage();
//    }
}
