package com.ygx.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/webController")
public class WebController {

    private static final Logger logger = LoggerFactory.getLogger(WebController.class);

    @Value("${image.value}")
    private String IMAGE_VALUE;

    @RequestMapping("/webTest")
    public String webTest(){
        return "hello world";
    }

    @RequestMapping("/dateTest")
    public Date dateTest(Date date){
        System.out.println(IMAGE_VALUE);
        return date;
    }

    @RequestMapping("/logTest")
    public void logTest(Date date){
        System.out.println(IMAGE_VALUE);
        logger.info("hello world");
    }






}
