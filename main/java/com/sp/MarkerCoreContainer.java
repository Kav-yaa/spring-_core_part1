package com.sp;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MarkerCoreContainer {
public static void main(String[] args) {
	
	Resource resource =new ClassPathResource("myconfig.xml");
//	 since it is interface we are using resource to give path for xml file to inform our spring to create object
	
	BeanFactory bFactory = new XmlBeanFactory(resource);

//	container wl create the object
//	here below we are fetching the object that is created with the help of reference variable myMarker and downcasting
   
	Marker m = (Marker) bFactory.getBean("myMarker"); //downcasting and getting object
    m.write();
}
}
