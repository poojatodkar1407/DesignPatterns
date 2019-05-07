package com.bridgeit.factoryPattern;

public class Pc extends Computer{
	
	private String CPU;
	private String RAM;
	private String HDD;
	
	public Pc(String CPU,String RAM,String HDD)
	{
		this.CPU =  CPU;
		this.RAM = RAM;
		this.HDD = HDD;
	}

	@Override
	public String getRam() {
		// TODO Auto-generated method stub
		return this.RAM;
	}

	@Override
	public String getHdd() {
		// TODO Auto-generated method stub
		return this.HDD;
	}

	@Override
	public String getCpu() {
		// TODO Auto-generated method stub
		return this.CPU;
	}
	

}
