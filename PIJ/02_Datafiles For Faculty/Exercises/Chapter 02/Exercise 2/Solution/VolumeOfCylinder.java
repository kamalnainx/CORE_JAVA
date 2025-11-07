package chapter02;
import java.util.Scanner;
public class VolumeOfCylinder 
{
	public static void main(String[] args) 
	{
		int r,h;
		double Volume;
		System.out.println("Enter the radius of circle:");
		Scanner sc1 = new Scanner(System.in);
		r= sc1.nextInt();
		System.out.println("Enter the Height of cylinder :");
		Scanner sc2 = new Scanner(System.in);
		h= sc2.nextInt();
		Volume=3.14*r*r*h;
		System.out.println("---------------------------------------------------------");
		System.out.println("Volume     ="+Volume );
		System.out.println("---------------------------------------------------------");
	}
}
    
