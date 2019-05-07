package com.bridgeit.facadepattern;
/**
 * Created By:Pooja Todkar.
 * Date :04/05/2019.
 * Purpose :implementation of Facade Design pattern.
 * Description : hides the complexities of the system and provide the inteface to
 * client can access the system easily.
 */

public class FacadeMain {
public static void main(String[] args) {
	ShapeMaker maker = new ShapeMaker();
	maker.drawCircle();
	maker.drawRectangle();
	maker.drawSquare();
}
}
