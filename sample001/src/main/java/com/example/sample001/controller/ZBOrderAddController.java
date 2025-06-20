package com.example.sample001.controller;

import jakarta.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.sample001.entity.ZBOrder;
import com.example.sample001.request.AppUserRequest;

@Controller
@RequestMapping("/orderList/add")
public class ZBOrderAddController {
	
	@GetMapping
	public String getOrderListAdd(Model model){
		
		
		return "orderListAdd";
	}
	
	@PostMapping("/submit")
	public String postOrderListAddSubmit(@ModelAttribute("ZBOrder") @Valid AppUserRequest request,
                          BindingResult bindingResult){
		if (bindingResult.hasErrors()) {
            return "user_edit";
        }
		ZBOrder order = new ZBOrder(0, null, null, null, null, false);
		order.setPartsNumber(0);
		return "AppOrderList";
		
	}

}
