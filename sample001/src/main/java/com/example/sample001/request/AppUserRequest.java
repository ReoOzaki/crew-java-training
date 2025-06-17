package com.example.sample001.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class AppUserRequest {

    // ユーザー名のバリデーション（未入力不可、3〜50文字）
    @NotBlank(message = "ユーザー名は必須です")
    @Size(min = 3, max = 50, message = "ユーザー名は3〜50文字で入力してください")
    private String username;

    // パスワードのバリデーション（未入力不可、6文字以上）
    @NotBlank(message = "パスワードは必須です")
    @Size(min = 6, message = "パスワードは6文字以上で入力してください")
    private String password;

    // --- getter / setter ---

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
