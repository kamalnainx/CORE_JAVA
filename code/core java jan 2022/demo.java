public class demo
{
    public static void main(String[] args)
    {
        plusdimand();
    }

    public static void plusdimand()
    {
           
        
        //center start
        //center top start
        for(int i =0; i<10; i++)
        {
            for (int j = 0; j < 20; j++)
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
   
    }
}