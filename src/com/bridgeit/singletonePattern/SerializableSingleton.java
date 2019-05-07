package com.bridgeit.singletonePattern;
/**
 * Created By:Pooja Todkar.
 * Date :05/05/2019.
 * Purpose :Serializable Singletone.
 * Description: it can destroy the single tone pattern.
 */

import java.io.Serializable;

@SuppressWarnings("serial")
public class SerializableSingleton implements Serializable{ // imeplements serializable means converting object to byte stream
	
	private SerializableSingleton()
	{
		
	}
	
	public static SerializableSingleton instance = new SerializableSingleton();
	
	public static Object readResolve()
	{
		return instance;
		
	}
	

}
