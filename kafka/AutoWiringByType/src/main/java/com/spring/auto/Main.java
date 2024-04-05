package com.spring.auto;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {

	public static void main(String[] args) {
		//Creating object of BeanFactory -->XmlBeanFactory
		Resource resource = new ClassPathResource("Spring.xml");
		 BeanFactory beanfactory  = new XmlBeanFactory(resource);
		 Categories categories = (Categories) beanfactory.getBean("categories");
          System.out.println("categories object is : "+categories);
          categories.show();
	}

}