package com.sp.setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPerson {
public static void main(String[] args) {
	
	ApplicationContext aContext = new ClassPathXmlApplicationContext("myconfig.xml");
	Person p = (Person) aContext.getBean("person");
	p.printInfo();
	
}
}
