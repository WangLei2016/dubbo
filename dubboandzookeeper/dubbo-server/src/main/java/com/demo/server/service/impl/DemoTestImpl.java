package com.demo.server.service.impl;  
  
import com.demo.server.service.DemoTest;  
  
public class DemoTestImpl implements DemoTest{  
  
    public String hello(String name) {  
        return "hello "+ name;  
    }  
}  