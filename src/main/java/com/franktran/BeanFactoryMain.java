package com.franktran;

import com.franktran.bean.Student;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * @author frank.tran
 */
public class BeanFactoryMain {

    public static void main(String[] args) {
        org.springframework.beans.factory.BeanFactory factory = new XmlBeanFactory(new ClassPathResource("ioc.xml"));
    }
}
