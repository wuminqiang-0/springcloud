package com.jk;

import com.jk.utils.DataSourceProxyAutoConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@Import(DataSourceProxyAutoConfiguration.class)
public class FeignApplication {

    /**
     * logger instance
     */
    static Logger logger = LoggerFactory.getLogger(FeignApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(FeignApplication.class, args);
        logger.info("账户服务启动成功");
    }

}
