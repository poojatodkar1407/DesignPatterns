package com.bridgeit.singletonePattern;
/**
 * Created By:Pooja Todkar.
 * Date :05/05/2019.
 * Purpose :Bill Pugh Singletone.
 * Description: Implemented with static inner helper class. 
 */
public class BillPughSingletone {
	

	private BillPughSingletone()
	{
		
	}
	
	public static BillPughSingletone getInstance()
	{
		return billBugher.instance;
	}
	
	private static class billBugher
	{
		 static BillPughSingletone instance = new BillPughSingletone();
	}
}
