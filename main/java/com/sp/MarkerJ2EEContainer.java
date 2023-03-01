package com.sp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MarkerJ2EEContainer {
public static void main(String[] args) {
	
//	
//ApplicationContext aContext = new ClassPathXmlApplicationContext("myconfig.xml"); 
//	here we are directly passing the xml file
//  Marker m	= (Marker) aContext.getBean("myMarker"); 
//	getting the object
//    m.write();

	
  

//	 or
	
	ConfigurableApplicationContext cApplicationcontext = new ClassPathXmlApplicationContext("myconfig.xml");
	Marker m = (Marker) cApplicationcontext.getBean("myMarker");
	m.write();
  
	
//  single tunn
//  ApplicationContext aContext = new ClassPathXmlApplicationContext("myconfig.xml"); 
//  Marker m	= (Marker) aContext.getBean("myMarker"); 
//  System.out.println(m);
//  Marker m1	= (Marker) aContext.getBean("myMarker"); 
//  System.out.println(m1);
  
//  if we give scope as prototype then we get different hashcode
}
}
