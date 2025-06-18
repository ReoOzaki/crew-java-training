package com.example.sample001.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.sample001.entity.AppUser;

@Repository
public interface AppUserRepository extends JpaRepository<AppUser, Long> {

    // ユーザーを新規登録（ネイティブSQL）
    @Modifying
    @Transactional
    @Query(value = "INSERT INTO app_user (id, username, password, role) VALUES (:id, :username, :password, :role)", nativeQuery = true)
    void insertUser(@Param("id") Long id,
                    @Param("username") String username,
                    @Param("password") String password,
                    @Param("role") String role);

    // ユーザー名でユーザーを取得（ネイティブSQL）
    @Query(value = "SELECT * FROM app_user WHERE username = :username", nativeQuery = true)
    Optional<AppUser> findByUsernameNative(@Param("username") String username);
    
    @Query(value = "SELECT COALESCE(MAX(id), 0) + 1 FROM app_user", nativeQuery = true)
    Long getNextId();

    // パスワードを更新（ネイティブSQL）
    @Modifying
    @Transactional
    @Query(value = "UPDATE app_user SET password = :password WHERE username = :username", nativeQuery = true)
    void updateUser(@Param("username") String username,
                    @Param("password") String password);
}
