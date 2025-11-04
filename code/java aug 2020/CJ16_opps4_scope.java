// what is scope?
// scope is just like, variable that are only accessible inside the region they are created



// public class CJ16_opps4_scope
// {
//     public static void main(String[] args)
//     {
//         int x=1;
//         System.out.println(x);    
//     }    
//     System.out.println(x);//error
// }





public class CJ16_opps4_scope
{
    int y=10;
    public static void main(String[] args)
    {
        CJ16_opps4_scope cj16 =new CJ16_opps4_scope();
        System.out.println(cj16.y);

        int x=1;
        System.out.println(x);    
    }    
    // System.out.println(x);//error
}
