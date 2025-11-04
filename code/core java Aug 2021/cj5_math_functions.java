/**
 * cj5_math_functions
 */
public class cj5_math_functions
{
    public static void main(String[] args)
    {
        int i=5 , j=10, k=-15, l=5-10;
        System.out.println(i+j); 
        System.out.println("add of i & j "+Math.addExact(i, j)); 
        System.out.println("max from i & j "+Math.max(i, j)); 
        System.out.println("min of i & j "+Math.min(i, j)); 
        System.out.println("multi of i & j "+Math.multiplyExact(i, j)); 
        System.out.println("squt of i  "+Math.sqrt(25)); 
        System.out.println("k is after abs "+Math.abs(k));
        System.out.println("________________________________________");
        System.out.println("k is after abs "+Math.abs(k));
        System.out.println("5 - 10 widthout  abs "+(l));
        System.out.println("5 - 10 with abs "+Math.abs(l));
        System.out.println("________________________________________");
        System.out.println("random number "+Math.random()); //0 to 1
        System.out.println("random number "+(int)(Math.random()*1000)); 
          
    }
    
}