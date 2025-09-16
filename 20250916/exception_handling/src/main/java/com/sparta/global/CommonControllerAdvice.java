package com.sparta.global;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

// com.sparta 패키지를 포함한 하위 패키지의  RestController 공통 적용
@RestControllerAdvice("com.sparta")
public class CommonControllerAdvice {
    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> errorHandler(Exception e) {

        HttpStatus status = HttpStatus.INTERNAL_SERVER_ERROR;
        if (e instanceof CommonException commonException) {
            status = commonException.getStatus();
        }

        return ResponseEntity.status(status).body(e.getMessage());
    }
}
