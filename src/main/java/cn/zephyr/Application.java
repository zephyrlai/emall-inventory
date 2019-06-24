package cn.zephyr;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: laizonghao
 * @Description: 启动类
 * @Date: 2019-06-24 15:10
 */
@SpringBootApplication
@MapperScan("cn.zephyr.module.dao")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
