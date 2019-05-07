package com.bridgeit.factoryPattern;
/**
 * Created By:Pooja Todkar.
 * Date :04/05/2019.
 * Purpose :implementation of Factory Design pattern.
 * Description : having the responsibility of instantiation of the class.
 */
public class ComputerFactory {
		public static Computer getInstance(String type , String CPU, String HDD , String RAM)
		{
			if("Pc".equalsIgnoreCase(type))
			{
				return new Pc(CPU, RAM,HDD);
			}
			else if("Server".equalsIgnoreCase(type))
			{
				return new Server(HDD,RAM,CPU);
			}
		
			return null;
		}
		
		
}
