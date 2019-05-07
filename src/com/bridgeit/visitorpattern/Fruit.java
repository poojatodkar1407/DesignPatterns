package com.bridgeit.visitorpattern;

/**
 * Created By:Pooja Todkar.
 * Date :05/05/2019.
 * Purpose : visitor design pattern.
 * Description: this pattern is used when you have distinct, unreached operation 
 * perform across the object 
 *  */

public class Fruit implements ItemElement{

	private int pricePerKg;
	private int weight;
	private String name;
	
	public Fruit(int pricePerKg, int weight, String name) {
		super();
		this.pricePerKg = pricePerKg;
		this.weight = weight;
		this.name = name;
	}

	public int getPricePerKg() {
		return pricePerKg;
	}

	public void setPricePerKg(int pricePerKg) {
		this.pricePerKg = pricePerKg;
	}

	public int getWeight() {
		return weight;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int accept(ShoppingCartVisitor visitor) {
	//System.out.println("visitior in fruit"+visitor.visit(this));
			return visitor.visit(this);
			//this is the object defines the under the fruit
	}
	
}
