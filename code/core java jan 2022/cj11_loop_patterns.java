import java.util.Scanner;
/**
 * cj12_loop_patterns
 */










public class cj11_loop_patterns
{
public static void main(String[] args)
{
    Scanner s1 = new Scanner(System.in);
    
    int i;
    do
    {
        System.out.println("\n\nPattern Menu:-\n");
        System.out.println("1   Square shape:-");
        System.out.println("2   Rectangle shape:-");
        System.out.println("3   Left down side angle shape:-");
        System.out.println("4   Left up side angle shape:-");
        System.out.println("5   Right down side angle shape:-");
        System.out.println("6   Right up side angle shape:-");
        System.out.println("7   Up side triangle shape");
        System.out.println("8   Down side triangle shape");
        System.out.println("9   Dimand shape:-");
        System.out.println("10  Star shape:-");
        System.out.println("11  Rocket shape:-");

        System.out.println("0 exit from shape menu:-\n");
        System.out.println("Select any one shape number:-\n");
        
        i=s1.nextInt();
        switch (i)
        {
            case 1:
                System.out.println("you are seleted 1st square shape:-");
                square();
            break;
            
            case 2:
                System.out.println("you are seleted 2nd rectangle shape:-");
                rectangle();
            break;

            case 3:
                System.out.println("you are seleted 3rd left down side angle shape:-");
                leftdownangle();
            break;

            case 4:
                System.out.println("you are seleted 4th left up side angle shape:-");
                leftupangle();
            break;

            case 5:
                System.out.println("you are seleted 5th Right down side angle shape:-");
                rightdownangle();
            break;

            case 6:
                System.out.println("you are seleted 6th Right up side angle shape:-");
                rightupangle();
            break;

            
            case 7:
                System.out.println("you are seleted 7th up side triangle shape:-");
                uptriangle();
            break;

            case 8:
                System.out.println("you are seleted 8th down side triangle shape:-");
                downtriangle();
            break;

            
            case 9:
                System.out.println("you are seleted 9th dimand shape:-");
                dimand();
            break;

            case 10:
                System.out.println("you are seleted 10th star shape:-");
                star();
            break;

            case 11:
                System.out.println("you are seleted 11th rocket shape:-");
                rocket();
            break;

        
            default:
                System.out.println("please select valid chouice");
                break;
        }    
    }
    while (i!=0);
}


























public static void square()
{
    for (int i = 0; i < 10; i++)
    {
        for (int j = 0; j < 20; j++)
        {
            System.out.print("*");
        }    
        System.out.println();
    }    
}

 





































public static void rectangle()
{
    for (int i = 0; i < 10; i++)
    {
        for (int j = 0; j < 40; j++)
        {
            System.out.print("*");
        }    
        System.out.println();
    }    
}




























public static void leftdownangle()
{
    for (int i = 0; i < 10; i++)
    {
        for (int j = i; j < 10; j++)
        {
            System.out.print("*");    
        }    
        System.out.println();
    }
}
































public static void leftupangle()
{
    for (int i = 0; i < 10; i++)
    {
        for (int j = 0; j < i; j++)
        {
            System.out.print("*");    
        }    
        System.out.println();
    }
}


























public static void rightdownangle()
{
    for (int i = 0; i < 10; i++)
    {
        for (int j = 0; j < i; j++)
        {
            System.out.print(" ");    
        }
        for (int j = i; j < 10; j++)
        {
            System.out.print("*");    
        }    
        System.out.println();
    }
}



































public static void rightupangle()
{
    for (int i = 0; i < 10; i++)
    {
        for (int j = i; j < 10; j++)
        {
            System.out.print(" ");    
        }
        for (int j = 0; j < i; j++)
        {
            System.out.print("*");    
        }    
        System.out.println();
    }
}






































public static void uptriangle()
{
    for (int i = 0; i < 10; i++)
    {
        for (int j = i; j < 10; j++)
        {
            System.out.print(" ");
        }
        for (int j = 0; j < i; j++)
        {
            System.out.print("* ");
        }    
        System.out.println();
    }    
}
























public static void downtriangle()
{
    for (int i = 0; i < 10; i++)
    {
        for (int j = 0; j < i; j++)
        {
            System.out.print(" ");
        }
        for (int j = i; j < 10; j++)
        {
            System.out.print("* ");
        }    
        System.out.println();
    }    
}



































public static void dimand()
{
    for (int i = 0; i < 10; i++)
    {
        for (int j = i; j < 10; j++)
        {
            System.out.print(" ");
        }
        for (int j = 0; j < i; j++)
        {
            System.out.print("* ");
        }    
        System.out.println();
    }    

    for (int i = 0; i < 10; i++)
    {
        for (int j = 0; j < i; j++)
        {
            System.out.print(" ");
        }
        for (int j = i; j < 10; j++)
        {
            System.out.print("* ");
        }    
        System.out.println();
    }    
}

































public static void star()
{
    for (int i = 0; i < 10; i++)
    {
        System.out.print("          ");
        for (int j = i; j < 10; j++)
        {
            System.out.print(" ");    
        }    
        for (int j = 0; j < i; j++)
        {
            System.out.print("* ");    
        }
        System.out.println();
    }
    
    for (int i = 0; i < 10; i++)
    {
    
        for (int j = 0; j < i; j++)
        {
            System.out.print(" ");    
        }    
        for (int j = i; j < 10; j++)
        {
            System.out.print("*");    
        }
        
        System.out.print("* * * * * * * * * *");

        for (int j = i; j < 10; j++)
        {
            System.out.print("*");    
        }
        System.out.println();
    }

    for (int i = 0; i < 10; i++)
    {
        System.out.print("          ");
        
        for (int j = i; j < 9; j++)
        {
            System.out.print("*");    
        }
        
        for (int j = 0; j < i; j++)
        {
            System.out.print("  ");
        }
        for (int j = i; j < 9; j++)
        {
            System.out.print("*");    
        }
        System.out.println();
    }
        
}










































public static void rocket()
{
    for (int i = 0; i < 10; i++)
    {
        System.out.print("          ");
        for (int j = i; j < 10; j++)
        {
            System.out.print(" ");    
        }    
        for (int j = 0; j < i; j++)
        {
            System.out.print("* ");    
        }
        System.out.println();
    }
    
    for (int i = 0; i < 10; i++)
    {
    
        for (int j = i; j < 10; j++)
        {
            System.out.print(" ");    
        }    
        for (int j = 0; j < i; j++)
        {
            System.out.print("*");    
        }
        
        System.out.print("* * * * * * * * * *");

        for (int j = 0; j < i; j++)
        {
            System.out.print("*");    
        }
        System.out.println();
    }

    for (int i = 0; i < 10; i++)
    {
        System.out.print("          ");
        
        for (int j = i; j < 9; j++)
        {
            System.out.print("*");    
        }
        
        for (int j = 0; j < i; j++)
        {
            System.out.print("  ");
        }
        for (int j = i; j < 9; j++)
        {
            System.out.print("*");    
        }
        System.out.println();
    }
        
}








}