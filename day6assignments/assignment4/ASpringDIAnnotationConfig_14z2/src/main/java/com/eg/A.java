package com.eg;

public class A {
	int p1;
	float f1;
	public A(int p1,float f1){
		this.p1 = p1;
		this.f1 = f1;
		System.out.println("A()"+p1);
		System.out.println("A()"+f1);
	}
	
	public void initBn(){
		System.out.println("initBn()...");
	}
	
	public void destroyBn(){
		System.out.println("destroyBn()...");
	}
	
	@Override
	public String toString(){
		return "a="+p1+"b="+f1;
	}
}
