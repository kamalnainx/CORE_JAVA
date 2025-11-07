package chapter03;

public class Pattern 
{
    public static void main(String[] args)
    {
        int i,j;
        
        for(i=5;i>0;i--)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}