package com.bridgeit.singletonePattern;

/**
 * Created By:Pooja Todkar.
 * Date :05/05/2019.
 * Purpose :Reflection Destroy Singletone.
 * Description: Reflection is API, through reflection we can invoke methods at runtime
 * irrespective of access specifier.
 */


public class ReflectionDestroy {
	
	private ReflectionDestroy()
	{
		
	}
	
	public static ReflectionDestroy getInstance()
	{
		return Reflection.instance;
	}
	
	private static class Reflection
	{
		static ReflectionDestroy instance = new ReflectionDestroy();
	}
}
