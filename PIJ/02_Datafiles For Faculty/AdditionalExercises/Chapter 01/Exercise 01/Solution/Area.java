
package chapter01;

public class Area {
  public double calculateArea(Shapes shape){
      double area=0;
      if(shape instanceof Rectangle){
          Rectangle rectangle=(Rectangle) shape;
          area=rectangle.getHeight()*rectangle.getWidth();
      }
      else if(shape instanceof Circle){
             Circle circle=(Circle) shape;
             area= 3.14*circle.getRadius()*circle.getRadius();
      }
      else if(shape instanceof Square){
             Square square=(Square) shape;
             area=square.getLength()*square.getLength();
      }
      return area;
  } 
  
  public static void main(String args[]){
      Rectangle rectangle=new Rectangle(23,45);
      Circle circle=new Circle(24);
      Square square=new Square(51);
      
      Area areaObj=new Area();
      System.out.println("Area of a square is : "+areaObj.calculateArea(square));
      System.out.println("Area of a rectangle is : "+areaObj.calculateArea(rectangle));
      System.out.println("Area of a circle is : "+areaObj.calculateArea(circle));
  }
}
