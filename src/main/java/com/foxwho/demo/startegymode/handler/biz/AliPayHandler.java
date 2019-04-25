package com.foxwho.demo.startegymode.handler.biz;

import com.foxwho.demo.startegymode.constant.PayConstant;
import com.foxwho.demo.startegymode.handler.AbstractHandler;
import com.foxwho.demo.startegymode.handler.HandlerPayId;
import com.foxwho.demo.startegymode.model.OrderDto;
import com.foxwho.demo.startegymode.model.PayDto;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

/**
 * 支付宝
 */
@Component
@HandlerPayId(payId = PayConstant.PAY_ID_ALIPAY)
public class AliPayHandler extends AbstractHandler {

    @Override
    public PayDto handler(OrderDto dto) {

        PayDto payDto = new PayDto();
        //拷贝对象
        BeanUtils.copyProperties(dto, payDto);
        payDto.setForm("这是支付宝表单");
        return payDto;
    }
}
