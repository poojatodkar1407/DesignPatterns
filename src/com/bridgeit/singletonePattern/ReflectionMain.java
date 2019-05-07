package com.bridgeit.singletonePattern;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
/**
 * Created By:Pooja Todkar.
 * Date :05/05/2019.
 * Purpose :Reflection Destroy Singletone.
 * Description: Reflection is API, through reflection we can invoke methods at runtime
 * irrespective of access specifier.
 */

public class ReflectionMain {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args)
			throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		ReflectionDestroy instance1 = ReflectionDestroy.getInstance(); // for normal instance
        ReflectionDestroy instance2 = null; 
        try  // making reflection so that it destroys the singletone.
        { 
            Constructor[] constructors =  
                    ReflectionDestroy.class.getDeclaredConstructors(); 
            for (Constructor constructor : constructors)  
            { 
                // Below code will destroy the singleton pattern 
                constructor.setAccessible(true); 
                instance2 = (ReflectionDestroy) constructor.newInstance(); 
                break; 
            } 
        } 
      
        catch (Exception e)  
        { 
            e.printStackTrace(); 
        } 
          
    System.out.println(instance1.hashCode()); 
    System.out.println(instance2.hashCode()); 
    } 
}
