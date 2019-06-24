package cn.zephyr.framework.request;

import cn.zephyr.framework.config.SysProperties;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * @Author: laizonghao
 * @Description: 存放请求任务的队列(单例)
 * @Date: 2019-06-24 22:24
 */
@Data
@Component
public class RequestQueues {

//    @Autowired
//    private SysProperties sysProperties;

    /**
     * 所有队列(每个线程持有一个队列，所以队列数与线程数相等)
     */
    private List<ArrayBlockingQueue<Request>> queue = new ArrayList<ArrayBlockingQueue<Request>>(10);

    private static RequestQueues instance;

    private RequestQueues() {
    }

    public static RequestQueues getInstance(){
        if(null == instance)
            instance = new RequestQueues();
        return instance;
    }

    public void addQueue(ArrayBlockingQueue<Request> queue){
        instance.getQueue().add(queue);
    }
}
