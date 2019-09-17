package com.zxq.fegin;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name= "spring-cloud-provider",fallback = HystrixFegin.class)
public interface FeginClient {
    @RequestMapping(value = "/hello")
    String hello(@RequestParam(value = "name") String name);
}