package com.example.webspringioc.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;


/**
 * profile可以作用在Configuration类上
 * 只有激活的环境注册的bean才有效
 */
@Service
public class ExampleBean6 {

    @Configuration
    @Profile("test")
    public class ProfileTestBean {
        @Bean
        public Object testProfile() {
            return new Object();
        }
    }

    @Configuration
    @Profile("dev")
    public class ProfileDevBean {
        @Bean
        public Object devProfile() {
            return new Object();
        }
    }

}
