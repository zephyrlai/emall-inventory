package cn.zephyr.framework.thread;

import cn.zephyr.framework.config.SysProperties;
import cn.zephyr.framework.request.Request;
import cn.zephyr.framework.request.RequestQueues;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author: laizonghao
 * @Description: 请求处理的线程池（维护一个ExecutorService类型的threadPool）
 * @Date: 2019-06-24 21:52
 */
@Component
public class RequestProcessorThreadPool {
//    @Autowired
//    private SysProperties sysProperties;

    /**
     * 线程池（存放执行请求任务的线程）
     */
    private ExecutorService threadPool = Executors.newFixedThreadPool(10);


    public RequestProcessorThreadPool() {
        RequestQueues queues = RequestQueues.getInstance();
        for (Integer i = 0; i < 10; i++) {
            ArrayBlockingQueue<Request> blockingQueue = new ArrayBlockingQueue<Request>(100);
            queues.addQueue(blockingQueue);
            threadPool.submit(new RequestProcessorThread(blockingQueue));
        }
    }

    /**
     * 单例模式（基于绝对线程安全的单例模式：静态内部类方式）；
     * 使用JVM的机制保障多线程并发安全：内部类的初始化，一定只会发生一次
     */
    private static class Singleton{
        private static RequestProcessorThreadPool instance;

        /**
         * 静态代码块只会执行一次
         */
        static {
            try {
                instance = new RequestProcessorThreadPool();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public RequestProcessorThreadPool getInstance(){
            return instance;
        }

    }

    public static RequestProcessorThreadPool getInstance(){
        return new Singleton().getInstance();
    }

    public static void init(){
        getInstance();
    }
}
