package com.bridgeit.singletonePattern;

/**
 * Created By:Pooja Todkar.
 * Date :05/05/2019.
 * Purpose :Thread Safe Singletone.
 * Description: It maintained singleton property even in multithreaded enviornment.
 */

public class TheradSafeInitialization {

	/*private TheradSafeInitialization()
	{
		
	}
	
	static TheradSafeInitialization instance = null;
	
	public static synchronized TheradSafeInitialization getInstance()
	{
		if(instance == null)
		{
			instance = new TheradSafeInitialization();
		}
		
		return instance;
	}
	*/
	
	private TheradSafeInitialization()
	{
		
	}
	
	static TheradSafeInitialization instance = null;
	
	public static TheradSafeInitialization getInstance()
	{
		if(instance == null)    // when instance is null
		{
			synchronized (TheradSafeInitialization.class) {// it waits another instance till first will get done
				
				instance = new TheradSafeInitialization();
			}
			
		}
		
		return instance;
	}
	
	
}


