package com.demo.consumer;  
  
import org.springframework.context.support.ClassPathXmlApplicationContext;  
  
import com.demo.server.service.DemoTest;  
  
public class ConsumerThd {  
    public void sayHello(){  
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext(    
        new String[] {"applicationConsumer.xml"});  
        context.start();  
        DemoTest demoService=(DemoTest) context.getBean("demoService");  
        System.out.println(demoService.hello("world"));  
   }    
}  