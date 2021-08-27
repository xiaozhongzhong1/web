package com.example.webspringioc.bean;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Service;


/**
 * ApplicationContextAware
 */
@Service
public class ExampleBean5 implements ApplicationContextAware, ApplicationEventPublisherAware {
    public static ApplicationContext app;
    public static ApplicationEventPublisher publisher;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        app = applicationContext;
    }

    public static void testBean(String beanName) {
        try {
            final Object bean = app.getBean(beanName);
            System.out.println(beanName + ":" + bean);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        publisher = applicationEventPublisher;
    }
}
