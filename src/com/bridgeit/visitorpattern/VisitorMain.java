package com.bridgeit.visitorpattern;

/**
 * Created By:Pooja Todkar.
 * Date :05/05/2019.
 * Purpose : visitor design pattern.
 * Description: this pattern is used when you have distinct, unreached operation 
 * perform across the object 
 *  */

public class VisitorMain {
	public static void main(String[] args) {
		//creating array of the items
		
		ItemElement[] items = new ItemElement[]{new Book(20, "1234"),new Book(100, "5678"),
				new Fruit(10, 2, "Banana"), new Fruit(5, 5, "Apple")};
		
		int total = calculatePrice(items);
		System.out.println("Total Cost = "+total);
	}

	
	private static int calculatePrice(ItemElement[] items) {
		ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();
		int sum=0;
		for(ItemElement item : items){
			sum = sum + item.accept(visitor);
		}
		return sum;
	}
}
