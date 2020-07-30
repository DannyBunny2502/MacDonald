package com.example.blws.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.blws.domain.OrderVO;

@Mapper
public interface OrderMapper {
	List<OrderVO> selectOrderList() throws Exception;

}
