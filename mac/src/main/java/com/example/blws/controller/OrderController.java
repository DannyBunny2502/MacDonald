package com.example.blws.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OrderController {

	
	@GetMapping("/order/order")
	public String order () {
		System.out.println("주문");
		return "order/order"; // �۾��� ������
	}
	
}

