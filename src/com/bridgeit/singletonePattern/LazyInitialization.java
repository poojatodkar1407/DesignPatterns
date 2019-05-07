package com.bridgeit.singletonePattern;
/**
 * Created By:Pooja Todkar.
 * Date :05/05/2019.
 * Purpose :Lazy initialization Singletone.
 * Description: creation of instance when required.
 */
public class LazyInitialization {
		
	private LazyInitialization()
	{
		
	}
	
	private static LazyInitialization instance = null;
	
	public static LazyInitialization getInstance()
	{
		if(instance == null)
		{
			instance = new LazyInitialization();
		}
		
		return instance;
	}
}
