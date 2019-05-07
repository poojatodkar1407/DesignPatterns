package com.bridgeit.visitorpattern;
/**
 * Created By:Pooja Todkar.
 * Date :05/05/2019.
 * Purpose : visitor design pattern.
 * Description: this pattern is used when you have distinct, unreached operation 
 * perform across the object 
 *  */

public interface ItemElement {
	public int accept(ShoppingCartVisitor visitor);
}
