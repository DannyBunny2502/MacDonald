package com.example.blws.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.blws.domain.OrderVO;
import com.example.blws.service.OrderService;



@Controller
public class OrderController {

	@Autowired 
	private OrderService orderService;
	
	@GetMapping("/order/order")
	public String order (Model model) throws Exception {
		System.out.println("주문");
		System.out.println(today());
		List<OrderVO> ordList = orderService.selectOrderList();
		model.addAttribute("orderList", ordList);
		System.out.println(ordList);
		return "order/order"; // �۾��� ������
	}
	
	@GetMapping("/order/check")
	public String check () {
		System.out.println("확인");
		return "order/check"; // �۾��� ������
	}
	
	@GetMapping("/header")
	public String header () {
		System.out.println("헤더");
		return "fragments/commonHeader"; // �۾��� ������
	}
	
	
	public String today() { // 주문번호에 사용될 오늘 날짜
		SimpleDateFormat todayFormat = new SimpleDateFormat("yyyyMMdd");
		Date time = new Date();
		
		String today = todayFormat.format(time);
		
		return today;
	}
	
}

