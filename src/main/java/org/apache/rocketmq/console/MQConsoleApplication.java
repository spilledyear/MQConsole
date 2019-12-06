package org.apache.rocketmq.console;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@ServletComponentScan
@EnableAspectJAutoProxy
@EnableScheduling
public class MQConsoleApplication {

    public static void main(String[] args) {
        SpringApplication.run(MQConsoleApplication.class, args);
    }

}
