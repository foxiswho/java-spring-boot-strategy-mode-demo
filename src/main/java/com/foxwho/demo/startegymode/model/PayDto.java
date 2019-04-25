package com.foxwho.demo.startegymode.model;

import lombok.Data;

@Data
public class PayDto {
    private String no;
    /**
     * 支付方式
     */
    private Integer payId;
    /**
     * 表单HTML
     */
    private String form;
}
