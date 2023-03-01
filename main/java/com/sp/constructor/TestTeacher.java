package com.sp.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestTeacher {
public static void main(String[] args) {
	
	ApplicationContext aContext = new ClassPathXmlApplicationContext("myconfig.xml");
	Teacher t = (Teacher) aContext.getBean("teacher");
	t.getInfo();
}
}
