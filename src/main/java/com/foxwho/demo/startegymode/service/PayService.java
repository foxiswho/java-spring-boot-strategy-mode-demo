package com.foxwho.demo.startegymode.service;

import com.foxwho.demo.startegymode.model.OrderDto;
import com.foxwho.demo.startegymode.model.PayDto;

public interface PayService {
    /**
     * 根据订单的不同类型作出不同的处理
     *
     * @param dto 订单实体
     * @return PayDto 处理后实体
     */
    PayDto handle(OrderDto dto);

}
