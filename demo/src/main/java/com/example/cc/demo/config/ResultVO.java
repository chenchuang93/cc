package com.example.cc.demo.config;

import lombok.Getter;

@Getter
public class ResultVO<T> {

    /**
     * 状态码，1000为成功
     */
    private final int code;

    /**
     * 提示信息
     */
    private final String msg;

    /**
     * 返回数据
     */
    private final T data;

    public ResultVO(T data) {
        this(ResultCode.SUCCESS, data);
    }

    public ResultVO(ResultCode resultCode, T data) {
        this(resultCode.getCode(), resultCode.getMsg(), data);
    }

    public ResultVO(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
}
