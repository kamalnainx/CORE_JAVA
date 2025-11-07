package chapter02;
import java.util.Scanner;
public class TemperatureConversion 
{
	public static void main(String[] args) 
	{
		double c;
		double f;
		System.out.println("Enter the temperature in Celsius:");
		Scanner sc1 = new Scanner(System.in);
		c= sc1.nextDouble();
		f=c*9/5+32;
		System.out.println("---------------------------------------------------------");
		System.out.println("Temperature in Fahrenheit     ="+f );
		System.out.println("---------------------------------------------------------");
	}
} 
