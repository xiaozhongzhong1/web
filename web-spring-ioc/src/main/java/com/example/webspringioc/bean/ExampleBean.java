package com.example.webspringioc.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;

@Service
/**
 * InitializingBean主要是完成初始化的工作
 * DisposableBean主要是完成结束清理工作
 * 这两个是spring的接口，会发生耦合，spring支持jdk自带的两个注解，可以做到相同的事情
 * @PostConstruct 和 @PreDestroy
 */
public class ExampleBean implements InitializingBean, DisposableBean {
    private int years;

    private String ultimateAnswer;

    public ExampleBean() {
    }

    public ExampleBean(int years, String ultimateAnswer) {
        this.years = years;
        this.ultimateAnswer = ultimateAnswer;
    }

    @Override
    public void afterPropertiesSet() throws Exception {

    }

    @Override
    public void destroy() throws Exception {

    }
}
