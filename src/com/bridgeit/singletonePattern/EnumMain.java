package com.bridgeit.singletonePattern;
/**
 * Created By:Pooja Todkar.
 * Date :05/05/2019.
 * Purpose :Enum Singletone.
 * Description: Enum basically used for declaring constants.overcome the problems of reflection.
 */

public class EnumMain {

	public static void main(String[] args) {
		
		EnumSingleton instance1 = EnumSingleton.Instance;
	
		EnumSingleton instance2 = EnumSingleton.Instance;
		System.out.println(instance1.hashCode()+"  "+instance2.hashCode());
	}
}
