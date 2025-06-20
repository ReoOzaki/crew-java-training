package com.example.sample001.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.sample001.entity.AppOrderList;
import com.example.sample001.service.OrderListService;

@Controller
@RequestMapping("/orderList")
public class OrderListController {

    private final OrderListService service;

    public OrderListController(OrderListService service) {
        this.service = service;
    }

    // 一覧表示
    @GetMapping
    public String showList(Model model) {
        model.addAttribute("orders", service.findAll());
        return "orderList"; // ⇒ orderList.html に対応
    }

    // 追加画面表示
    @GetMapping ("/add")
    public String showForm(Model model) {
        model.addAttribute("order", new AppOrderList());
        return "orderListAdd"; // ⇒ orderAdd.html に対応
    }

    // フォーム提出処理
    @PostMapping("/submit")
    public String submitForm(@ModelAttribute AppOrderList order) {
        service.save(order);
        return "redirect:/order/list";
    }
}
