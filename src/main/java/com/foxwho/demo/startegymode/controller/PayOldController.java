package com.foxwho.demo.startegymode.controller;

import com.foxwho.demo.startegymode.constant.PayConstant;
import com.foxwho.demo.startegymode.model.OrderDto;
import com.foxwho.demo.startegymode.model.PayDto;
import com.foxwho.demo.startegymode.service.PayOldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RequestMapping("/old")
@RestController
public class PayOldController {

    @Autowired
    private PayOldService payOldService;

    /**
     * 支付宝
     *
     * @return
     */
    @GetMapping("/alipay")
    public PayDto alipay() {
        OrderDto orderDto = new OrderDto();
        orderDto.setPayId(PayConstant.PAY_ID_ALIPAY);
        orderDto.setNo("N" + System.currentTimeMillis());
        orderDto.setAmountPayment(new BigDecimal(20000.0));
        PayDto payDto = payOldService.handle(orderDto);
        return payDto;
    }

    /**
     * 通联支付
     *
     * @return
     */
    @GetMapping("/allinpay")
    public PayDto allinpay() {
        OrderDto orderDto = new OrderDto();
        orderDto.setPayId(PayConstant.PAY_ID_ALLINPAY);
        orderDto.setNo("N" + System.currentTimeMillis());
        orderDto.setAmountPayment(new BigDecimal(20000.0));
        PayDto payDto = payOldService.handle(orderDto);
        return payDto;
    }

    /**
     * 微信
     *
     * @return
     */
    @GetMapping("/wechat")
    public PayDto wechat() {
        OrderDto orderDto = new OrderDto();
        orderDto.setPayId(PayConstant.PAY_ID_WECHAT);
        orderDto.setNo("N" + System.currentTimeMillis());
        orderDto.setAmountPayment(new BigDecimal(20000.0));
        PayDto payDto = payOldService.handle(orderDto);
        return payDto;
    }
}
