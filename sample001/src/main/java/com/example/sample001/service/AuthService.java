package com.example.sample001.service;

import com.example.sample001.entity.AppUser;
import com.example.sample001.repository.AppUserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    private final AppUserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    // リポジトリとパスワードエンコーダーを注入
    public AuthService(AppUserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    // ユーザー登録処理
    public void registerUser(AppUser user) {
        // パスワードをハッシュ化
        String encodedPassword = passwordEncoder.encode(user.getPassword());

        // ユーザー情報をDBに保存（ロールはUSER固定）
        userRepository.insertUser(user.getUsername(), encodedPassword, "USER");
    }
}
