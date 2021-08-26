package com.example.webspringioc.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Service;

import java.util.Iterator;


/**
 * 测试beanFactory后置处理器:操纵bean
 */
@Service
public class ExampleBean4 implements BeanFactoryPostProcessor, Ordered {


    @Override
    public int getOrder() {
        return 101;
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        //可以将一个对象实例写入spring
        configurableListableBeanFactory.registerSingleton("test_add_singleton_bean", new Object());

        final Iterator<String> beanNamesIterator = configurableListableBeanFactory.getBeanNamesIterator();
        while (beanNamesIterator.hasNext()) {
            try {
                final String next = beanNamesIterator.next();
                final Object bean = configurableListableBeanFactory.getBean(next);
                System.out.println(next + ":" + bean.getClass().getSimpleName());
            } catch (Exception e) {
                System.out.println(e);
            }
        }

    }


}
