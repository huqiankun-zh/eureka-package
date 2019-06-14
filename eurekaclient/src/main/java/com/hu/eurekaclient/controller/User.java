package com.hu.eurekaclient.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class User {


  @GetMapping("/user/{id}")
  @ResponseBody
  public Map<String,Object> getUser(@PathVariable("id")String id){
    Map<String,Object> map = new HashMap<>();
    map.put("id",id);
    map.put("name","hu");
    return map;
  }
}
