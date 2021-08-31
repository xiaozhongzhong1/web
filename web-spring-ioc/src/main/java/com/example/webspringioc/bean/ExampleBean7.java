package com.example.webspringioc.bean;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

/**
 * spring中的事件与监听
 * ApplicationContext中的事件处理是通过ApplicationEvent类和ApplicationListener接口提供的
 */
@Service
public class ExampleBean7 {
    @Service
    public class Listener1 implements ApplicationListener {
        /**
         * 可以接受到所有触发的事件
         *
         * @param applicationEvent
         */
        @Override
        public void onApplicationEvent(ApplicationEvent applicationEvent) {
            System.out.println(applicationEvent);
        }
    }

    /**
     * 使用这个不用自己过滤事件
     */
    @Service
    public class Listener2 {
        @EventListener({ContextRefreshedEvent.class})
        public void onEvent(ContextRefreshedEvent applicationEvent) {
            System.out.println(applicationEvent);
        }
    }
}
