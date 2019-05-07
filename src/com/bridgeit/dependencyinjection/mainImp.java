package com.bridgeit.dependencyinjection;
/**
 * Created By:Pooja Todkar.
 * Date :04/05/2019.
 * Purpose :implementation of Dependency injection.
 */
public class mainImp {

	public static void main(String[] args) {
		
		//creating different objects of service
			Service s1 = new Service("cool");
			Service s2 = new Service("hot");
			Service s3 = new Service("moderate");
			
			
			Customer c1 = new Customer(s1);
			Customer c2 = new Customer(s2);
			Customer c3 = new Customer(s3);
			
			c1.visitCustomer();
			c2.visitCustomer();
			c3.visitCustomer();

	}
}
