package com.bridgeit.singletonePattern;
/**
 * Created By:Pooja Todkar.
 * Date :05/05/2019.
 * Purpose :Static block Singletone.
 * Description: Since the static block executed only once so that we can use the static block the singletone class.
 */
public class StaticInitialization {
 
	private StaticInitialization()
	{
		
	}
	
	static StaticInitialization instance = null;
	
	static
	{
		instance = new StaticInitialization();
	}
	
	public static StaticInitialization getInstance()
	{
		return instance;
	}
}
// Since the static block executed only once so that we can use the static block
// the singletone class.