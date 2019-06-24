package cn.zephyr.framework.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

import java.util.Properties;

/**
 * @Author: laizonghao
 * @Description:
 * @Date: 2019-06-24 22:05
 */
@Data
public class SysProperties extends Properties {

    @Value("${request.processor.thread.num}")
    private Integer reqProcessorThreadNum;
}
