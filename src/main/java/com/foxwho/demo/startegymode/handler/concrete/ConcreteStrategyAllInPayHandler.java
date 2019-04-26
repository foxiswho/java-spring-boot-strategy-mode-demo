package com.foxwho.demo.startegymode.handler.concrete;

import com.foxwho.demo.startegymode.constant.PayConstant;
import com.foxwho.demo.startegymode.handler.AbstractHandler;
import com.foxwho.demo.startegymode.handler.HandlerPayId;
import com.foxwho.demo.startegymode.model.OrderDto;
import com.foxwho.demo.startegymode.model.PayDto;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

/**
 * 通联
 */
@Component
@HandlerPayId(payId = PayConstant.PAY_ID_ALLINPAY)
public class ConcreteStrategyAllInPayHandler extends AbstractHandler {

    @Override
    public PayDto handler(OrderDto dto) {

        PayDto payDto = new PayDto();
        //拷贝对象
        BeanUtils.copyProperties(dto, payDto);
        //调用 通联SDK
        payDto.setForm("这是通联表单");
        return payDto;
    }
}
