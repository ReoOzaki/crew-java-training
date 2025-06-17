package com.example.sample001.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import com.example.sample001.security.CustomUserDetailsService;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    private final CustomUserDetailsService userDetailsService;

    // ユーザー情報を扱うサービスをDI
    public SecurityConfig(CustomUserDetailsService userDetailsService) {
        this.userDetailsService = userDetailsService;
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
            // 認可設定：登録画面とCSSは誰でもアクセス可、他は認証を要求
            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/register", "/css/**").permitAll()
                .anyRequest().authenticated())
            // ログイン画面の設定：カスタムログインページと成功時の遷移先を指定
            .formLogin(form -> form
                .loginPage("/login")
                .defaultSuccessUrl("/", true)
                .permitAll())
            // ログアウト時の遷移先を設定
            .logout(logout -> logout
                .logoutSuccessUrl("/login?logout")
                .permitAll());
        // 設定を反映したSecurityFilterChainを返却
        return http.build();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        // パスワードのハッシュ化方式を指定
        return new BCryptPasswordEncoder();
    }
}
