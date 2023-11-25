package com.example.cc.demo.entity;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class User {
    @NotNull(message = "id不能为空")
    private Long id;

    @NotNull
    @NotNull(message = "用户账号不能为空")
    @Size(min = 6, max = 20, message = "用户账号长度必须在6-20之间")
    private String account;

    @NotNull(message = "用户密码不能为空")
    @Size(min = 6, max = 20, message = "用户密码长度必须在6-20之间")
    private String password;

    @NotNull(message = "用户邮箱不能为空")
    @Email(message = "用户邮箱格式不正确")
    private String email;
}
