package com.sp;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestSB {

	public static void main(String[] args) {
		
//	ApplicationContext ac = new ClassPathXmlApplicationContext("myconfig.xml");
//		when we use this  above container, the object is created for SampleBean class just with myconfig.xml file usage
//		so the printing statement inside constructor is executed as constructor gets executed at the time of object creation
// but getValue method is not executed ad method gets execute  when we call
		
		Resource r = new ClassPathResource("myconfig.xml");
		BeanFactory bFac = new XmlBeanFactory(r);
		SampleBean s = (SampleBean) bFac.getBean("sb");
		s.getValue();
//		or sysout(s.getValue());
		
//		beanFactory is lazy to create object on demand but applicationContext is eager to create object before the demand
	}
}
