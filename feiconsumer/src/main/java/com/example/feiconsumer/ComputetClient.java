package com.example.feiconsumer;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("computer-service")
public interface ComputetClient {

    @RequestMapping(method = RequestMethod.GET,value = "/add")
    Integer add(@RequestParam(value="a") Integer a,@RequestParam(value = "b") Integer b);
}
