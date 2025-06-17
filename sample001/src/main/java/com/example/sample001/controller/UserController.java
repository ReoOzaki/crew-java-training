package com.example.sample001.controller;

import com.example.sample001.entity.AppUser;
import com.example.sample001.request.AppUserRequest;
import com.example.sample001.service.UserService;
import jakarta.validation.Valid;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    // UserService をコンストラクタ経由で受け取る
    public UserController(UserService userService) {
        this.userService = userService;
    }

    // ユーザー情報編集フォームを表示
    @GetMapping("/edit")
    public String showEditForm(@AuthenticationPrincipal UserDetails userDetails,
                               Model model,
                               @RequestParam(name = "success", required = false) Boolean success) {
        // 現在ログイン中のユーザー情報を取得
        AppUser user = userService.getUserByUsername(userDetails.getUsername());

        // フォーム表示用のリクエストオブジェクトに値をセット
        AppUserRequest request = new AppUserRequest();
        request.setUsername(user.getUsername());
        request.setPassword(user.getPassword());

        // モデルに値を渡して画面に表示
        model.addAttribute("user", request);
        model.addAttribute("success", success != null && success);
        return "user_edit";
    }

    // ユーザー情報更新処理
    @PostMapping("/edit")
    public String updateUser(@ModelAttribute("user") @Valid AppUserRequest request,
                             BindingResult bindingResult) {
        // 入力チェックでエラーがあればフォームを再表示
        if (bindingResult.hasErrors()) {
            return "user_edit";
        }

        // 入力された内容を元にユーザー情報を更新
        AppUser user = new AppUser();
        user.setUsername(request.getUsername());
        user.setPassword(request.getPassword());

        userService.updateUser(user);

        // 成功メッセージ付きでリダイレクト
        return "redirect:/user/edit?success=true";
    }
}
