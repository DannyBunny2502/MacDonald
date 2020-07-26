package com.example.blws.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.blws.domain.EmpVO;
import com.example.blws.service.EmpService;

@RestController
public class EmpController {
	
	@Autowired
	private EmpService empService;
	
	@RequestMapping("/all")
	public List<EmpVO> selectEmpList() throws Exception{
		System.out.println("selectEmpList in");
		List<EmpVO> empList = empService.selectEmpList(); // 사원정보 조회
		System.out.println("selectEmpList out");
		return empList;
	}
	
}

