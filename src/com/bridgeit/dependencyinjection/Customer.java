package com.bridgeit.dependencyinjection;

public class Customer {
	Service service;
	
	public Customer(Service service)
	{
		this.service = service;
	}
	public String visitCustomer()
	{
		System.out.println(service.getName());
		return service.getName();
	}
}
