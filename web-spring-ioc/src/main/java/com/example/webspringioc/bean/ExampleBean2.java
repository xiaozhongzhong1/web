package com.example.webspringioc.bean;

import org.springframework.context.SmartLifecycle;
import org.springframework.stereotype.Service;

/**
 * 生命周期启动与停止
 */
@Service
public class ExampleBean2 implements SmartLifecycle {

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }

    @Override
    public boolean isRunning() {
        return false;
    }

    @Override
    public boolean isAutoStartup() {
        return false;
    }

    @Override
    public void stop(Runnable callback) {

    }

    /**
     * 关系到启动的顺序，相位越低，先启动，后停止。
     * @return
     */
    @Override
    public int getPhase() {
        return 0;
    }
}
