package com.sp;

public class SampleBean {

	private int value;

	
//	constructor
	public SampleBean(int value) {
	System.out.println("sample bean init");
		this.value = value;
	}
	
	public int getValue()
	{
		return value;
	}
	
}
