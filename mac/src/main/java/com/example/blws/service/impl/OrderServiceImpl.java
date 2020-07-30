package com.example.blws.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.blws.domain.OrderVO;
import com.example.blws.mapper.OrderMapper;
import com.example.blws.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired OrderMapper orderMapper;
	
	@Override
	public List<OrderVO> selectOrderList() throws Exception {
		System.out.println("serviceImpl");
		return orderMapper.selectOrderList();
	}
	
}
