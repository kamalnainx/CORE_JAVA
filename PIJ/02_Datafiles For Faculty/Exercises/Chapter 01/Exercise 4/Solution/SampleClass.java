package chapter01;
public class SampleClass 
{
    public int counter = 1;
    
    void Display() 
    {
    System.out.println("The value of the counter is: "+ counter);
    }

public static void main(String ar[]) 
    {
SampleClass Obj1 = new SampleClass();
Obj1.Display();
    }
}

