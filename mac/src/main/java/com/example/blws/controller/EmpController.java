package com.example.blws.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import com.example.blws.domain.EmpVO;
import com.example.blws.mapper.EmpMapper;

@Controller
public class EmpController {
	@Qualifier(value="EmpMapper")
	EmpMapper empMapper;
	
	@RequestMapping("/emp")
	public List<EmpVO> selectEmpList() throws Exception{
		System.out.println("selectEmpList");
		List<EmpVO> empList = empMapper.selectEmpList();
		System.out.println("selectEmpList");
		return empList;
	}
	
	@GetMapping("/")
	public String greeting() throws Exception{
		
		return "greeting";
	}
}