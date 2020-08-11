package com.example.blws.service;

import java.util.List;
import java.util.Map;

import com.example.blws.domain.EmpVO;

public interface EmpService {
	List<EmpVO> selectEmpList() throws Exception;
	List<EmpVO> selectOrdList() throws Exception;
	List<EmpVO> selectMtrList() throws Exception;
	List<EmpVO> selectMatsList() throws Exception;
	List<EmpVO> selectMenuList() throws Exception;
	void saveMats(Map<String,String> matsMap) throws Exception;
	void updtMats(Map<String,String> updtMap) throws Exception;
	List<EmpVO> selectWhereMats(Map<String,String> matsMap) throws Exception;
}
