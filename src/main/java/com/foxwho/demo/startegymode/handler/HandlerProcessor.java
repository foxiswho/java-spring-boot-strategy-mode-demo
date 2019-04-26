package com.foxwho.demo.startegymode.handler;


import com.foxwho.demo.startegymode.constant.PayConstant;
import com.foxwho.demo.startegymode.scaner.ClassScaner;
import com.google.common.collect.Maps;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
@SuppressWarnings("unchecked")
public class HandlerProcessor implements BeanFactoryPostProcessor {

    /**
     * 包路径
     */
    private static final String HANDLER_PACKAGE = "com.foxwho.demo.startegymode.handler.concrete";

    /**
     * 扫描@HandlerPayId，初始化HandlerContext，将其注册到spring容器
     *
     * @param beanFactory bean工厂
     * @see HandlerPayId
     * @see StrategyHandlerContext
     */
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        Map<Integer, Class> handlerMap = Maps.newHashMapWithExpectedSize(PayConstant.COUNT_PAY_ID);
        //扫描指定包路径下类
        ClassScaner.scan(HANDLER_PACKAGE, HandlerPayId.class).forEach(clazz -> {
            // 获取注解中的类型值
            int type = ((HandlerPayId) clazz.getAnnotation(HandlerPayId.class)).payId();
            // 将注解中的类型值作为key，对应的类作为value，保存在Map中
            handlerMap.put(type, clazz);
        });
        // 初始化HandlerContext，将其注册到spring容器中
        StrategyHandlerContext context = new StrategyHandlerContext(handlerMap);
        //注册到spring容器中
        beanFactory.registerSingleton(StrategyHandlerContext.class.getName(), context);
    }

}
