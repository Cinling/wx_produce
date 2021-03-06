package cn.cinling.srv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SrvApplication {

    public static void main(String[] args) {
        SpringApplication.run(SrvApplication.class, args);
    }
}
