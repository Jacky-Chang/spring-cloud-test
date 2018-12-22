package com.example.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {

    @Autowired
    RestTemplate restTemplate;
@RequestMapping(value="/add",method = RequestMethod.GET)
    public String  add(){
        return  restTemplate.getForEntity("http://computer-service/add?a=15&b=20",String.class).getBody();
    }
}
