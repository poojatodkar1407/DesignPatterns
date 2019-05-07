package com.bridgeit.singletonePattern;
/**
 * Created By:Pooja Todkar.
 * Date :05/05/2019.
 * Purpose :Eager initialization Singletone.
 * Description: creation of instance at load time. 
 */
public class EagerInitialization {
	
	private EagerInitialization()
	{
		
	}
	
	private static EagerInitialization instance = new EagerInitialization();
	
	public static EagerInitialization getInstance()
	{
		return instance;
	}

}
