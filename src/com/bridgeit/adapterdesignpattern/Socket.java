package com.bridgeit.adapterdesignpattern;
/**
 * Created By:Pooja Todkar.
 * Date :04/05/2019.
 * Purpose :Adapter Design Pattern.
 */

public class Socket {
	public Volt getVolt()
	{
		return new Volt(120);		
	}
}
