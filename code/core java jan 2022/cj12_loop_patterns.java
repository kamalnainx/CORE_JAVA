import java.util.Scanner;
/**
 * cj12_loop_patterns
 */










public class cj12_loop_patterns
{
public static void main(String[] args)
{
    Scanner s1 = new Scanner(System.in);
    
    int i;
    do
    {
        System.out.println("\n\npattern menu:-\n");
        System.out.println("1 square shape:-");
        System.out.println("2 rectangle shape:-");
        System.out.println("3 triangle shape:-");
        System.out.println("4 dimand shape:-");
        System.out.println("5 plus shape:-");
        System.out.println("6 plus dimand shape:-");
        System.out.println("7 plus dimand triangle shape:-");
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
                System.out.println("you are seleted 3rd triangle shape:-");
                triangle();
            break;

            case 4:
                System.out.println("you are seleted 4th dimand shape:-");
                dimand();
            break;

            case 5:
                System.out.println("you are seleted 5th plus shape:-");
                plus();
            break;

            case 6:
                System.out.println("you are seleted 6th plus dimand shape:-");
                plusdimand();
            break;
            
            case 7:
                System.out.println("you are seleted 7th plus dimand triangle shape:-");
                plustriangledimand();
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






































public static void triangle()
{
    for (int i = 0; i < 20; i++)
    {
        for (int j = i; j < 20; j++)
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


































public static void dimand()
{
    for (int i = 0; i < 15; i++)
    {
        for (int j = i; j < 15; j++)
        {
            System.out.print(" ");
        }
        for (int j = 0; j < i; j++)
        {
            System.out.print("* ");
        }    
        System.out.println();
    }    

    for (int i = 0; i < 15; i++)
    {
        for (int j = 0; j < i; j++)
        {
            System.out.print(" ");
        }
        for (int j = i; j < 15; j++)
        {
            System.out.print("* ");
        }    
        System.out.println();
    }    
}





















public static void plus()
{
    for (int i = 0; i < 10; i++)
    {
        for (int j = 1; j < 10; j++)
        {
            System.out.print("  ");
        }
        for (int j = 0; j < 10; j++)
        {
            System.out.print("* ");
        }    
        System.out.println();
    }    
    
    for (int i = 0; i < 10; i++)
    {
        for (int j = 0; j < 29; j++)
        {
            System.out.print("* ");
        }    
        System.out.println();
    }
    
    for (int i = 0; i < 10; i++)
    {
        for (int j = 1; j < 10; j++)
        {
            System.out.print("  ");
        }
        for (int j = 0; j < 10; j++)
        {
            System.out.print("* ");
        }    
        System.out.println();
    }    
    
}





























































public static void plusdimand()
{
    //top start
    for (int i = 0; i < 10; i++)
    {
        for (int j = 1; j < 20; j++)
        {
            System.out.print("  ");
        }
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
    // top end
    
    //top square start
    for (int i = 0; i < 5; i++)
    {
        for (int j = 1; j < 20; j++)
        {
            System.out.print("  ");
        }
        for (int j = 0; j < 10; j++)
        {
            System.out.print("* ");
        }    
        System.out.println();
    }    
    // top square end
    
    
    //center start
    for (int i = 0; i < 10; i++)
    {
        //fornt
        for (int j = i; j < 10; j++)
        {
            System.out.print("  ");
        }
        for (int j = 0; j < i; j++)
        {
            System.out.print("* ");
        }
        
        
        //mid
        for (int j = 0; j < 29; j++)
        {
            System.out.print("* ");
        }

        //end    
        for (int j = 0; j < i; j++)
        {
            System.out.print("* ");
        }
        System.out.println();
    }

    for (int i = 0; i < 10; i++)
    {
        //fornt
        for (int j = 0; j < i; j++)
        {
            System.out.print("  ");
        }
        for (int j = i; j < 10; j++)
        {
            System.out.print("* ");
        }
               
        //mid
        for (int j = 0; j < 29; j++)
        {
            System.out.print("* ");
        }
        
        //end
        for (int j = i; j < 10; j++)
        {
            System.out.print("* ");
        }
        System.out.println();
    }
    //center end    
    
    // bottom square start
    for (int i = 0; i < 5; i++)
    {
        for (int j = 1; j < 20; j++)
        {
            System.out.print("  ");
        }
        for (int j = 0; j < 10; j++)
        {
            System.out.print("* ");
        }    
        System.out.println();
    }    
    // bottom square end    

    // bottom start
    for (int i = 0; i < 10; i++)
    {
        for (int j = 1; j < 20; j++)
        {
            System.out.print("  ");
        }
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
    // bottom end    
}








































































public static void plustriangledimand()
{
    //top start
    for (int i = 0; i < 20; i++)
    {
        for (int j = 1; j < 14; j++)
        {
            System.out.print("  ");
        }
        for (int j = i; j < 19; j++)
        {
            System.out.print(" ");
        }    
        for (int j = 0; j < i; j++)
        {
            System.out.print("* ");
        }    
        
        System.out.println();
    }    
    // top end
    
    //top square start
    for (int i = 0; i < 5; i++)
    {
        for (int j = 1; j < 19; j++)
        {
            System.out.print("  ");
        }
        for (int j = 0; j < 10; j++)
        {
            System.out.print("* ");
        }    
        System.out.println();
    }    
    // top square end
    
    
            //center start
        //center top start
        for(int i =0; i<10; i++)
        {
            for (int j = 0; j < 19; j++)
            {
                System.out.print(" ");    
            }
            for (int j = i; j < 10; j++)
            {
                System.out.print(" ");    
            }
            for (int j = 0; j < i/2; j++)
            {
                    System.out.print("* ");       
                 
            }
            for (int j = 0; j < 6; j++)
            {
                System.out.print(" ");    
            }
            for (int j = 0; j < 10; j++)
            {
                System.out.print("* ");    
                
            }
            for (int j = 0; j < 6; j++)
            {
                System.out.print(" ");    
            }
            if(i%2==0)
            {
                
                for (int j = 0; j < i/2; j++)
                {
                    System.out.print(" *");    
                }
            }
                
            if(i%2==1)
            {
                for (int j = 0; j <(i-1)/2; j++)
                {
                    System.out.print(" *");    
                }
            }
            
            System.out.println();
            
        }
        //center top end
        
        //center mid 1 start
        for (int i = 0; i < 10; i++)
        {
            //fornt
            for (int j = i; j < 10; j++)
            {
                System.out.print("  ");
            }
            for (int j = 0; j < i; j++)
            {
                System.out.print("* ");
            }
            
            
            //mid
            for (int j = 0; j < 25; j++)
            {
                System.out.print("* ");
            }
            //end    
            for (int j = 0; j < i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        //center mid 1 end

        //center mid 2 start
        for (int i = 0; i < 10; i++)
        {
            //fornt
            for (int j = 0; j < i; j++)
            {
                System.out.print("  ");
            }
            for (int j = i; j < 10; j++)
            {
                System.out.print("* ");
            }
                   
            //mid
            for (int j = 0; j < 25; j++)
            {
                System.out.print("* ");
            }
            //end
            for (int j = i; j < 10; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        // center mid 2 end
        
        //center bottom start
        for (int i = 0; i < 10; i++)
        {
            for (int j = 0; j < 20; j++)
            {
                System.out.print(" ");
            }    
            for (int j = 0; j < i; j++)
            {
                System.out.print(" ");
            }    
            for (int j = i/2; j < 5; j++)
            {
                System.out.print("* ");
            }    
            for (int j = 0; j < 5; j++)
            {
                System.out.print(" ");
            }    
            for (int j = 0; j < 10; j++)
            {
                System.out.print("* ");
            }    
            for (int j = 0; j < 5; j++)
            {
                System.out.print(" ");
            }    
            if(i%2==0)
            {
                for (int j = (i-1)/2; j < 5; j++)
                {
                    System.out.print("* ");
                }
            }
            if(i%2==1)
            {
                for (int j = i/2; j < 5; j++)
                {
                    System.out.print("* ");
                }
            }
            
            System.out.println();
        }
        //center end

    
    // bottom square start
    for (int i = 0; i < 5; i++)
    {
        for (int j = 1; j < 19; j++)
        {
            System.out.print("  ");
        }
        for (int j = 0; j < 10; j++)
        {
            System.out.print("* ");
        }    
        System.out.println();
    }    
    // bottom square end    

    // bottom start
    for (int i = 0; i < 20; i++)
    {
        for (int j = 1; j < 14; j++)
        {
            System.out.print("  ");
        }
        for (int j = 0; j < i; j++)
        {
            System.out.print(" ");
        }    
        for (int j = i; j < 20; j++)
        {
            System.out.print("* ");
        }    
        
        System.out.println();
    }    
    // bottom end    
}




}    