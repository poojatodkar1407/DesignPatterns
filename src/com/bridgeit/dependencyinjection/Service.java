package com.bridgeit.dependencyinjection;

public class Service {
	public String name;

	public Service() {
	
	}

	public Service(String name) {
		
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
