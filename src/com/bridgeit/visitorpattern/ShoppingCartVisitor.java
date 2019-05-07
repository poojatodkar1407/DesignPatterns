package com.bridgeit.visitorpattern;

public interface ShoppingCartVisitor {

	int visit(Book visitor);
	int visit(Fruit fruit);
}
