
package chapter01;

public class Circle implements Shapes
{
  
    private double radius;

    public Circle ( double initradius)
    {
	
	radius = initradius;
    }
    
    public void draw ()
    {
	System.out.println ("Drawing a Circle with radius "+radius+" cm");
    }

     public void setRadius (double newRadius)
    {
	radius = newRadius;
    }

    public double getRadius() {
        return radius;
    }
}
