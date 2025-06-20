package com.example.sample001.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/orderList/add")
public class ZBOrderAddController {
	
	@GetMapping
	public String getOrderListAdd(Model model){
		
		
		return "orderListAdd";
	}
//	
//	@PostMapping("/submit")
//	public String postOrderListAddSubmit(@ModelAttribute("ZBOrder") @Valid AppUserRequest request,
//                           BindingResult bindingResult){
//		ZBOrder order = new ZBOrder(0, null, null, null, null, false);
//		order.setPartsNumber(request.);
//		
//	}

}
