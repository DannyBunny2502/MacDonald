package com.example.blws.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.example.blws.domain.EmpVO;

@Mapper
public interface EmpMapper {
	List<EmpVO> selectEmpList() throws Exception;

	String selectEmpCode() throws Exception;
	
	List<EmpVO> selectOrdList() throws Exception;
	List<EmpVO> selectMtrList() throws Exception;
	List<EmpVO> selectMatsList() throws Exception;
	List<EmpVO> selectMenuList() throws Exception;
	void saveMats(Map<String,String> matsMap) throws Exception;
	void updtMats(Map<String,String> updtMap) throws Exception;
	List<EmpVO> selectWhereMats(Map<String,String> matsMap) throws Exception;
}
