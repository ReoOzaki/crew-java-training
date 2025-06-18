package com.example.sample001.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "app_user")  // ★ テーブル名を明示
public class AppUser {

    // 主キー（自動生成）
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // ユーザー名
    @Column(name = "username", nullable = false, unique = true)
    private String username;

    // パスワード（ハッシュ化想定）
    @Column(name = "password", nullable = false)
    private String password;

    // ユーザーのロール（デフォルトは USER）
    @Column(name = "role", nullable = false)
    private String role = "USER";

    // --- getter / setter ---
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
