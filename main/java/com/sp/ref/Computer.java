package com.sp.ref;

public class Computer {
	
	USB refusb;
//	Has a relationship
// we need to inject object to thic reference and using setter methods we can do it 
	
	public void setRefusb(USB refusb) {
		this.refusb = refusb;
	}
	
	public void use()
	{
		System.out.println("I am using computer");
		refusb.connect();
//		to call connect method we need object of USB class in Computer class
	}

}
