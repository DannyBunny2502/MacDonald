package com.example.blws.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.blws.domain.EmpVO;
import com.example.blws.mapper.EmpMapper;
import com.example.blws.service.EmpService;

@Service
public class EmpServiceImpl implements EmpService {

	@Autowired EmpMapper empMapper;
	
	@Override
	public List<EmpVO> selectEmpList() throws Exception {
		System.out.println("serviceImpl");
		return empMapper.selectEmpList();
	}
	
}
