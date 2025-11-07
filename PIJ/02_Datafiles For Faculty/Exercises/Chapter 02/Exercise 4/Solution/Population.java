package population;
import java.util.Scanner;
public class Population 
{
	public static void main(String[] args) 
	{
		int population=80000;
		int men,literate,illetrate;
		men=52*population/100;
		literate=35*men/100;
		illetrate=men-literate;
		System.out.println("---------------------------------------------------------");
		System.out.println("Total men               ="+men );
		System.out.println("---------------------------------------------------------");
		System.out.println("Total literate men      ="+literate );
		System.out.println("---------------------------------------------------------");
		System.out.println("Total illetrate men     ="+illetrate );
	}
} 