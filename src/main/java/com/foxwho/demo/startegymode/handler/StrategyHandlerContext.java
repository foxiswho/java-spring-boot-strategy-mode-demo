package com.foxwho.demo.startegymode.handler;


import com.foxwho.demo.startegymode.util.SpringBeanUtil;

import java.util.Map;

/**
 * 策略上下文
 */
@SuppressWarnings("unchecked")
public class StrategyHandlerContext {

    private Map<Integer, Class> handlerMap;

    public StrategyHandlerContext(Map<Integer, Class> handlerMap) {
        this.handlerMap = handlerMap;
    }

    /**
     * 获取实例化后对象
     *
     * @param payId
     * @return
     */
    public AbstractHandler getInstance(Integer payId) {
        if (null == payId) {
            throw new IllegalArgumentException("payId not null : " + payId);
        }
        Class clazz = handlerMap.get(payId);
        if (clazz == null) {
            throw new IllegalArgumentException("not found handler for payId: " + payId);
        }
        return (AbstractHandler) SpringBeanUtil.getBean(clazz);
    }

}
