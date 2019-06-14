package com.hu.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@RestController
public class user {
  @Autowired
  RestTemplate restTemplate;
  @GetMapping("/user/{id}")
  @ResponseBody
  public Map<String,String> getUser(@PathVariable("id")String id){
    Map<String,String> result = null;
    result=restTemplate.getForObject("http://provider/getUser/"+id,Map.class);
    return result;
  }
}
