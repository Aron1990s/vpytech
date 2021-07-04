package com.aron.vpythontech;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VpythontechApplication {

    protected final static Logger logger = LoggerFactory.getLogger(VpythontechApplication.class);


    public static void main(String[] args) {
        SpringApplication.run(VpythontechApplication.class, args);
        logger.info("[~~~乾杯~~梦想已在路上~~ (^_^)／★＼(^_^) ~~道路已在脚下~~乾杯~~~]");
    }

}
