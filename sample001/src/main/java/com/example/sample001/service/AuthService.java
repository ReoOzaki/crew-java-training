package com.example.sample001.service;

import com.example.sample001.entity.AppUser;
import com.example.sample001.repository.AppUserRepository;

import jakarta.transaction.Transactional;

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
    @Transactional
    public void registerUser(AppUser user) {
        // 次のIDを取得
        Long nextId = userRepository.getNextId();

        // パスワードをハッシュ化
        String encodedPassword = passwordEncoder.encode(user.getPassword());

        // ネイティブSQLで挿入
        userRepository.insertUser(
            nextId,
            user.getUsername(),
            encodedPassword,
            "USER"
        );
    }
}
