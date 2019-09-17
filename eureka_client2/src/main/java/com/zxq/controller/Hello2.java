package com.zxq.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello2 {

        @RequestMapping("/hello")
        public String hello(@RequestParam String name){
            return "hello "+name+"   this SECOND messge";
        }
}
