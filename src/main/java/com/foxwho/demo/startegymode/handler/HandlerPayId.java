package com.foxwho.demo.startegymode.handler;


import com.foxwho.demo.startegymode.constant.PayConstant;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface HandlerPayId {
    int payId() default PayConstant.PAY_ID_ALIPAY;

}
