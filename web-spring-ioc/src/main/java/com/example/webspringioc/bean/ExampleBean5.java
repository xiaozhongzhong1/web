package com.example.webspringioc.bean;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;


/**
 * 测试beanFactory后置处理器:操纵bean
 */
@Service
public class ExampleBean5 implements ApplicationContextAware {
    public static ApplicationContext app;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        app = applicationContext;
    }

    public static void testBean(String beanName) {
        final Object bean = app.getBean(beanName);
        System.out.println(beanName + ":" + bean);
    }
}
