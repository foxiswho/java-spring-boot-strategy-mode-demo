package com.foxwho.demo.startegymode.service.impl;


import com.foxwho.demo.startegymode.handler.AbstractHandler;
import com.foxwho.demo.startegymode.handler.StrategyHandlerContext;
import com.foxwho.demo.startegymode.model.OrderDto;
import com.foxwho.demo.startegymode.model.PayDto;
import com.foxwho.demo.startegymode.service.IStrategyPayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StrategyPayServiceImpl implements IStrategyPayService {
    @Autowired
    private StrategyHandlerContext handlerContext;

    @Override
    public PayDto handle(OrderDto dto) {
        AbstractHandler handler = handlerContext.getInstance(dto.getPayId());
        return handler.handler(dto);
    }
}