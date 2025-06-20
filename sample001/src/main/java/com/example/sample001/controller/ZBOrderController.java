package com.example.sample001.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.sample001.entity.ZBOrder;

@Controller
public class ZBOrderController {
	
	@GetMapping("/orderList")
	public String getOrderList(Model model){
			
		List<ZBOrder> orders = List.of(
				new ZBOrder(1, "ek35", "2024-31-3", "weokgweogk", "test", false),
				new ZBOrder(6, "rewr", "2020-01-5", "This is a comment", "test", false)
				);
		model.addAttribute("orders", orders);
		
		return "orderList";
	}
	
	

}
