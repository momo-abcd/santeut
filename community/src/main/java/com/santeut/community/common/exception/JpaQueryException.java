package com.santeut.community.common.exception;

//필요한 에러 이렇게 만들어서 쓰세요
public class JpaQueryException extends RuntimeException{
    public JpaQueryException(String message) {
        super(message);
    }
}
