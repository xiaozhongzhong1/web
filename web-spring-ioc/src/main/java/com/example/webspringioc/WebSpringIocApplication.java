package com.example.webspringioc;

import com.example.webspringioc.bean.ExampleBean5;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 只调试IOC,不调web相关
 */
@SpringBootApplication
public class WebSpringIocApplication {
    static {
        fork();
    }
    public static void main(String[] args) {


        SpringApplication.run(WebSpringIocApplication.class, args);

        ExampleBean5.testBean("test_add_singleton_bean");
        ExampleBean5.testBean("devProfile");
        ExampleBean5.testBean("testProfile");
        ExampleBean5.testBean("defaultProfile");
    }



    private static void fork() {
        new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

}
