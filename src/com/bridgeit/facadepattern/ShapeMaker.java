package com.bridgeit.facadepattern;
/**
 * Created By:Pooja Todkar.
 * Date :04/05/2019.
 * Purpose :implementation of Facade Design pattern.
 * Description : hides the complexities of the system and provide the inteface to
 * client can access the system easily.
 */
public class ShapeMaker {
	private Shape rectangle;
    private Shape circle;
    private Shape square;
    
    public ShapeMaker()
    {
        rectangle= new Rectangle();
        circle= new Circle();
        square= new Square();
        
    }
    public void drawRectangle()
    {
        rectangle.draw();
    }
    public void drawCircle()
    {
        circle.draw();
    }
    public void drawSquare()
    {
        square.draw();
    }

 

}
