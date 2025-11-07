/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter01;

public class Square implements Shapes{
  double length;

    public Square(double length) {
        this.length = length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }
  
    public void draw(){
        System.out.println();
    }
    
}
