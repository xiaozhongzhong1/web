package com.example.webspringioc.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Service;


/**
 * 测试bean后置处理器:可以用来修改bean,aop估计就是用的这个来完成的
 */
@Service
public class ExampleBean3 implements BeanPostProcessor, Ordered {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if ("ExampleBean".equalsIgnoreCase(beanName)) {
            System.out.println(beanName+" postProcessBeforeInitialization");
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if ("ExampleBean".equalsIgnoreCase(beanName)) {
            System.out.println(beanName+" postProcessAfterInitialization");
        }
        return bean;
    }

    /**
     * 设置调用顺序
     *
     * @return
     */
    @Override
    public int getOrder() {
        return 100;
    }
}
