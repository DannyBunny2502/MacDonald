package com.example.blws.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.blws.domain.EmpVO;
import com.example.blws.service.EmpService;

@Controller
public class EmpController {
	
	@GetMapping("/ysy2")
	public String index2() {
		System.out.println("eee");
		return "matplace/matplace";
		
	}
}
