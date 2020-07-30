package com.example.blws.service;

import java.util.List;
import java.util.Map;

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

	@Override
	public List<EmpVO> selectOrdList() throws Exception {
		System.out.println(empMapper.selectOrdList());
		return empMapper.selectOrdList();
	}

	@Override
	public List<EmpVO> selectMtrList() throws Exception {
		return empMapper.selectMtrList();
	}

	@Override
	public List<EmpVO> selectMatsList() throws Exception {
		return empMapper.selectMatsList();
	}

	@Override
	public List<EmpVO> selectMenuList() throws Exception {
		return empMapper.selectMenuList();
	}

	@Override
	public void saveMats(Map<String,String> matsMap) throws Exception {
		System.out.println("Save Matstore Service!!");
		empMapper.saveMats(matsMap);
	}
	
}
