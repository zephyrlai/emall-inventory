package cn.zephyr.framework.thread;

import cn.zephyr.framework.request.Request;
import lombok.Data;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Callable;

/**
 * @Author: laizonghao
 * @Description: 真正执行请求任务的线程
 * @Date: 2019-06-24 22:10
 */
@Data
public class RequestProcessorThread implements Callable<Boolean> {

    /**
     * 当前线程所持有的（内存）请求队列
     */
    private ArrayBlockingQueue<Request> arrayBlockingQueue;

    public RequestProcessorThread(ArrayBlockingQueue<Request> arrayBlockingQueue) {
        this.arrayBlockingQueue = arrayBlockingQueue;
    }

    /**
     * Computes a result, or throws an exception if unable to do so.
     *
     * @return computed result
     * @throws Exception if unable to compute a result
     */
    @Override
    public Boolean call() throws Exception {
        return true;
    }
}
