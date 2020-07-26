package com.example.blws.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.blws.domain.EmpVO;

@Mapper
public interface EmpMapper {
	List<EmpVO> selectEmpList() throws Exception;

	String selectEmpCode() throws Exception;
}
