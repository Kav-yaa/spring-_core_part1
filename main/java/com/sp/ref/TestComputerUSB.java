package com.sp.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestComputerUSB {
public static void main(String[] args) {
	
	ApplicationContext aContext = new ClassPathXmlApplicationContext("myconfig.xml");
	Computer c = (Computer) aContext.getBean("mycomputer");
	c.use();
}
}
