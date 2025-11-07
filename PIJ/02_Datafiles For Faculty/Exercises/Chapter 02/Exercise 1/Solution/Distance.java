
package chapter02;

import java.util.Scanner;

public class Distance
{
	public static void main(String[] args) 
	{
		int u,a,t,Distance;
		System.out.println("Enter the value of Initial Velocity:");
		Scanner sc1 = new Scanner(System.in);
		u= sc1.nextInt();
		System.out.println("Enter the value of acceleartion:");
		Scanner sc2 = new Scanner(System.in);
		a= sc2.nextInt();
		System.out.println("Enter the value of time:");
		Scanner sc3 = new Scanner(System.in);
		t= sc2.nextInt();
		Distance=u*t+(a*t*t)/2;
		System.out.println("---------------------------------------------------------");
		System.out.println("Distance Travelled     ="+Distance + " Meter");
		System.out.println("---------------------------------------------------------");
	}
}

