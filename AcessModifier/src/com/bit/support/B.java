package com.bit.support;

public class B extends A
{
	 
	// There is two way of calling the calss to different calss at same pacakage
	// inheritance and objective creation 
	void c()// this is the inheritance way 
	{
		

	}
	 A x = new A();// this is object creation way 
	void abc()
	{
		System.out.println(x.publcVariable);
		System.out.println(protectedVariable);
		System.out.println("hello world");
		System.out.println(" say hello world");
		
	}
	
	
}
//we can't access private variable in the same package
	


