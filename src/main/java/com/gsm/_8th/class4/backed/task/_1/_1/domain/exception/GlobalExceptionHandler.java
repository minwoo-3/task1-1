package com.gsm._8th.class4.backed.task._1._1.global.exception;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.NoSuchElementException;

@RestControllerAdvice //예외처리 클래스라고 정의
public class GlobalExceptionHandler {

    @ExceptionHandler(NoSuchElementException.class) //NoSuchElementException이 던져지면 이 메서드 실행
    public ResponseEntity<String> handleNotFound(NoSuchElementException e) {
        return ResponseEntity.status(404).body(e.getMessage()); //404상태코드와 함께 에러 메시지 반환
    }
}
