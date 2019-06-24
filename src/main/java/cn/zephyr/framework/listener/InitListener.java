package cn.zephyr.framework.listener;

import cn.zephyr.framework.thread.RequestProcessorThreadPool;
import org.springframework.stereotype.Component;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @Author: laizonghao
 * @Description: 系统初始化监听器
 * @Date: 2019-06-24 21:49
 */
@Component
public class InitListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.err.println("==========系统初始化监听器正在启动=============");
        RequestProcessorThreadPool.init();
        System.err.println("==========系统初始化监听器启动成功=============");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
