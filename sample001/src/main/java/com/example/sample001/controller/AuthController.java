package com.example.sample001.controller;

import com.example.sample001.request.AppUserRequest;
import com.example.sample001.entity.AppUser;
import com.example.sample001.service.AuthService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
public class AuthController {

    private final AuthService authService;

    // AuthService をコンストラクタ経由で受け取る
    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    // ログインページを表示
    @GetMapping("/login")
    public String login() {
        return "login";
    }

    // 新規登録フォームを表示
    @GetMapping("/register")
    public String showRegisterForm(Model model) {
        model.addAttribute("user", new AppUserRequest());
        return "register";
    }

    // 新規登録処理
    @PostMapping("/register")
    public String register(@ModelAttribute("user") @Valid AppUserRequest request,
                           BindingResult bindingResult) {
        // 入力チェックでエラーがあればフォームを再表示
        if (bindingResult.hasErrors()) {
            return "register";
        }

        // フォームの内容を元にユーザー情報を作成し登録
        AppUser user = new AppUser();
        user.setUsername(request.getUsername());
        user.setPassword(request.getPassword());
        authService.registerUser(user);

        // 登録完了後はログインページへリダイレクト
        return "redirect:/login";
    }
}
