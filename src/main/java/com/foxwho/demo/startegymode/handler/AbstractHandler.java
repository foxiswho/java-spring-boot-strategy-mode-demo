package com.foxwho.demo.startegymode.handler;


import com.foxwho.demo.startegymode.model.OrderDto;
import com.foxwho.demo.startegymode.model.PayDto;

public abstract class AbstractHandler {
    abstract public PayDto handler(OrderDto dto);
}
