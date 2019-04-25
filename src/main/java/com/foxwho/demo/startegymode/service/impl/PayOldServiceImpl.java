package com.foxwho.demo.startegymode.service.impl;


import com.foxwho.demo.startegymode.constant.PayConstant;
import com.foxwho.demo.startegymode.model.OrderDto;
import com.foxwho.demo.startegymode.model.PayDto;
import com.foxwho.demo.startegymode.service.PayOldService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class PayOldServiceImpl implements PayOldService {

    @Override
    public PayDto handle(OrderDto dto) {
        PayDto payDto = new PayDto();
        //拷贝对象
        BeanUtils.copyProperties(dto, payDto);
        if (PayConstant.PAY_ID_ALIPAY == dto.getPayId()) {
            //调用支付宝SDK
            payDto.setForm("这是 ifelse.switch 支付宝表单");
        } else if (PayConstant.PAY_ID_WECHAT == dto.getPayId()) {
            //调用 微信SDK
            payDto.setForm("这是 ifelse.switch 微信表单");
        } else if (PayConstant.PAY_ID_ALLINPAY == dto.getPayId()) {
            //调用 通联SDK
            payDto.setForm("这是 ifelse.switch 通联表单");
        } else {
            //调用支付宝SDK
            payDto.setForm("这是 ifelse.switch 支付宝表单");
        }
        return payDto;
    }
}