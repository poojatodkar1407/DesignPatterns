package com.bridgeit.singletonePattern;
/**
 * Created By:Pooja Todkar.
 * Date :05/05/2019.
 * Purpose :Main class for all design pattern.
 * Description: main implementation.
 */
public class SingletonMain {
	
	public static void main(String[] args) {
		
		System.out.println("*******EAGER INITIALIZATION*******");
		
		EagerInitialization instance = EagerInitialization.getInstance();
		System.out.println(instance.hashCode());
		
		EagerInitialization instance1 = EagerInitialization.getInstance();
		System.out.println(instance1.hashCode());
		
		System.out.println("*******LAZY INITIALIZATION*******");
		
		LazyInitialization obj1 = LazyInitialization.getInstance();
		System.out.println(obj1.hashCode());
		
		LazyInitialization obj2 = LazyInitialization.getInstance();
		System.out.println(obj2.hashCode());
		
		System.out.println("********USING STATIC BLOCK**********");
		
		StaticInitialization object = StaticInitialization.getInstance();
		System.out.println(object.hashCode());
		
		StaticInitialization object1 = StaticInitialization.getInstance();
		System.out.println(object1.hashCode());
		
		System.out.println("********USING THREAD SAFE INITIALIZATION**********");
		
		TheradSafeInitialization Oobject = TheradSafeInitialization.getInstance();
		System.out.println(Oobject.hashCode());
		
		TheradSafeInitialization Oobject1 = TheradSafeInitialization.getInstance();
		System.out.println(Oobject1.hashCode());
		
		System.out.println("********BILL PUGH INITIALIZATION**********");
		
		BillPughSingletone Bobject = BillPughSingletone.getInstance();
		System.out.println(Bobject.hashCode());
		
		BillPughSingletone Bobject1 = BillPughSingletone.getInstance();
		System.out.println(Bobject1.hashCode());
		
		
	}	
	
}