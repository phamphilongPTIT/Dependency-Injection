package com.k003.lesson4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserControl implements DataDAO {
    private ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
   HelloWorld obj = (HelloWorld) context.getBean("HelloWorld");
    @Override
    public void print() {
        System.out.println("Print: "+this.obj.getMessage());
    }

    private HelloWorld helloWorld(){return helloWorld();}
}
