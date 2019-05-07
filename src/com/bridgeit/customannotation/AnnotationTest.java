package com.bridgeit.customannotation;
/**
 * Created By:Pooja Todkar.
 * Date :04/05/2019.
 * Purpose :implementation of Annotation.
 * Description : Annotation is the tag represents the metadata.
 */

//Creating annotation  
import java.lang.annotation.*;  
import java.lang.reflect.*;  

@Retention(RetentionPolicy.RUNTIME)  //specify at what level annotation will be available
@Target(ElementType.METHOD) // used to specify at which type the annotation is used  
@Inherited
@interface MyAnnotation // Single value annotation
{  
  int value();  
}  

//Applying annotation  
class Hello
{  
 @MyAnnotation(value=10)  
 public void sayHello()
 {
	 System.out.println("hello annotation");
 }  
}  


class hi extends Hello
{
	public void sayHello()
	 {
		 System.out.println("hello annotation");
	 } 
}
//Accessing annotation  
class TestCustomAnnotation
{  
public static void main(String args[])throws Exception
{  

  Hello h=new Hello();  
  Method m=h.getClass().getMethod("sayHello"); 
  MyAnnotation manno=m.getAnnotation(MyAnnotation.class);  
  System.out.println("value is: "+manno.value()); 
  @SuppressWarnings("unused")
hi obj=new hi();
  Method n=h.getClass().getMethod("sayHello");
}
} 