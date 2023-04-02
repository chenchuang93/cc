package com.example.cc.demo.config;

import lombok.Getter;

@Getter
public enum ResultCode {
    SUCCESS(1000, "success"),
    FAILED(1001, "success"),
    VALIDATE_FAILED(1002, "参数校验失败"),
    ERROR(5000, "error"),
    ;
    private final int code;
    private final String msg;
    ResultCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
