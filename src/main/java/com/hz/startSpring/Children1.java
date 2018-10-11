package com.hz.startSpring;

public class Children1 extends Father{
	private String name="cc1";
	
	public String getName(){
		return name;
	}
	public static void main(String[] args){
		Children1 c1=new Children1();
		Children2 c2=new Children2();
		c2.setName("c2");
		System.out.println(c1.getName());
		System.out.println(c2.getName());
	}
}
