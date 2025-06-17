package com.example.sample001.service;

import com.example.sample001.entity.AppUser;
import com.example.sample001.repository.AppUserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final AppUserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    // リポジトリとパスワードエンコーダーを注入
    public UserService(AppUserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    // ユーザー名からユーザー情報を取得
    public AppUser getUserByUsername(String username) {
        return userRepository.findByUsernameNative(username)
                .orElseThrow(() -> new IllegalArgumentException("ログインユーザーが見つかりません"));
    }

    // ユーザー情報を更新（パスワードはハッシュ化して保存）
    public void updateUser(AppUser user) {
        String encodedPassword = passwordEncoder.encode(user.getPassword());
        userRepository.updateUser(user.getUsername(), encodedPassword);
    }
}
