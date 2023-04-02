package com.example.cc.demo.config;

import lombok.Getter;

@Getter
public class ApiException extends RuntimeException {

    private final int code;
    private final String msg;

    public ApiException(String msg) {
        this(1001, msg);
    }

    public ApiException(int code, String msg) {
        super(msg);
        this.code = code;
        this.msg = msg;
    }
}
