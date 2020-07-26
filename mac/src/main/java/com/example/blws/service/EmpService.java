package com.example.blws.service;

import java.util.List;

import com.example.blws.domain.EmpVO;

public interface EmpService {
	List<EmpVO> selectEmpList() throws Exception;
}
