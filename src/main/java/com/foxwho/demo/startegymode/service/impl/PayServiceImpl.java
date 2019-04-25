package com.foxwho.demo.startegymode.service.impl;


import com.foxwho.demo.startegymode.handler.AbstractHandler;
import com.foxwho.demo.startegymode.handler.HandlerContext;
import com.foxwho.demo.startegymode.model.OrderDto;
import com.foxwho.demo.startegymode.model.PayDto;
import com.foxwho.demo.startegymode.service.PayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PayServiceImpl implements PayService {
    @Autowired
    private HandlerContext handlerContext;

    @Override
    public PayDto handle(OrderDto dto) {
        AbstractHandler handler = handlerContext.getInstance(dto.getPayId());
        return handler.handler(dto);
    }
}