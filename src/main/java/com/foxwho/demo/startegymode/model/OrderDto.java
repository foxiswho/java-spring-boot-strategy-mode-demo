package com.foxwho.demo.startegymode.model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class OrderDto {
    private String no;
    private Integer uid;

    private BigDecimal amountPayment;

    /**
     * 订单类型
     * 普通订单；
     * 团购订单；
     * 促销订单；
     */
    private Integer typeBiz;
    /**
     * 订单属性
     */
    private Integer typeAttr;
    /**
     * 类别优惠
     */
    private Integer typePromotion;
    /**
     * 发货类型
     */
    private Integer typeDelivery;
    /**
     * 来源
     */
    private Integer typeSourceModule;

    /**
     * 支付方式
     */
    private Integer payId;
}
