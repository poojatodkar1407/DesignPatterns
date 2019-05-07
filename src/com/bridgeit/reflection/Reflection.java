package com.bridgeit.reflection;
/**
 * Created By:Pooja Todkar.
 * Date :06/05/2019.
 * Purpose :Reflection API.
 */

public class Reflection {
	
	private String string;

	public Reflection() {
		string = "Pooja";
	}
	
	//Creation method with no arguments
	
	public void method1()
	{
		System.out.println("method 1"+string);
	}
	
	//creating method with argument
	
	public void method2(int n)
	{
		System.out.println("method 2"+ string +"  "+n );
	}
	
	//creating private method
	
	@SuppressWarnings("unused")
	private void method3()
	{
		System.out.println("In private method");
	}
	
	
	

}
