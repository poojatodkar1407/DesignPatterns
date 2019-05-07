package com.bridgeit.factoryPattern;

public class Server extends Computer {
	private String HDD;
	private String RAM;
	private String CPU;

	public Server(String hDD, String RAM, String cPU) {
		this.HDD = hDD;
		this.RAM = RAM;
		this.CPU = cPU;
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
