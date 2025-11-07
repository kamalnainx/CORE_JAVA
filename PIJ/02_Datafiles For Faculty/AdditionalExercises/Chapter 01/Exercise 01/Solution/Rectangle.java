/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter01;

public class Rectangle implements Shapes

{
    double  width;
    double  height;
    
    public Rectangle ( double initw, double inith)
    {
	
	width = initw;
	height = inith;
    }
    
    public void draw ()
    {
	System.out.println ("Drawing a Rectangle with width "+width+" cm and height  "+height+"cm");
    };

   
    public void setWidth (double newWidth)
    {
	width = newWidth;
    }

    public void setHeight (double newHeight)
    {
	height = newHeight;
    }

   

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
   
}
