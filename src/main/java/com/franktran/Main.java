package com.franktran;

import com.franktran.bean.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author frank.tran
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ioc.xml");
        Student student = context.getBean("frank", Student.class);
        System.out.println(student);
    }
}
