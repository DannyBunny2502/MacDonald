package com.example.blws.mapper;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.blws.domain.EmpVO;

@Service
@Qualifier("EmpMapper")
public interface EmpMapper {
	public List<EmpVO> selectEmpList() throws Exception;
}
