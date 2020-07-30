package com.example.blws.service;

import java.util.List;

import com.example.blws.domain.OrderVO;

public interface OrderService {
	List<OrderVO> selectOrderList() throws Exception;
}
