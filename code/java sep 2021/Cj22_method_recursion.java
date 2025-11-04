// function recursion 
// when function call itself that is recursion
// recursion is a kind of technique which provids to way to break complicated problems down  into simple problems which are easier to solve.


// /**
//  * Cj22_method_recursion
//  */
// class Cj22_method_recursion
// {
    
//     static int get(int k,int i)
//     {
//         i++;
//         System.out.println(i);
//         int total=0;
//         total=total+i;
//         if(i<=k)
//         {
//             return get(k, i);
//         }

//         return total;
//     }
//     public static void main(String[] args)
//     {
//         System.out.println("final i valur or total value is "+get(5,0));
//     }
// }




















// /**
//  * Cj22_method_recursion
//  */
// class Cj22_method_recursion
// {
    
//     static int get(int k)
//     {
        
//         System.out.println("the i is "+k);
//         if(k>0)
//         {
//             return get(k-1);
//         }
//         return 0;
//     }
//     public static void main(String[] args)
//     {
//         System.out.println("final i valur or total value is "+get(5));
//     }
// }





























// /**
//  * Cj22_method_recursion
//  */
// class Cj22_method_recursion
// {
    
//     static int get(int k)
//     {
        
//         System.out.println("the i is "+k);
//         if(k>0)
//         {
            
//             return k+get(k-1);
//         }
        
//         else
//         {
//             return 0;
//         }
        
//     }
//     public static void main(String[] args)
//     {
//         System.out.println("final i valur or total value is "+get(10));
//     }
// }























// /**
//  * Cj22_method_recursion
//  */
// class Cj22_method_recursion
// {
    
//     static int get(int k,int i)
//     {
        
//         System.out.println("the i is "+i);
//         if(k>0)
//         {
//             i=i+k;
//             return k+get(k-1,i);
                //step 1 5+get(4)
                //step 2 5+(4+(get(3)))
                //step 3 5+(4+(3+(get(2))))
                //step 4 5+(4+(3+(2+(get(1)))))
                //step 5 5+(4+(3+(2+(1+(get(1))))))
                //last final    5+4+3+2+1+0
                //final         15=output
//         }
        
//         else
//         {
//             return 0;
//         }
        
//     }
//     public static void main(String[] args)
//     {
//         System.out.println("final i valur or total value is "+get(5,0));
//     }
// }























// /**
//  * Cj22_method_recursion
//  */
// class Cj22_method_recursion
// {
    
//     static int get(int k,int i)
//     {
        
//         System.out.println("the i is "+i);
//         if(k>=1)
//         {
//             i=i*k;
//             return k*get(k-1,i);
//         }
        
//         else
//         {
//             return 1;
//         }
        
//     }
//     public static void main(String[] args)
//     {
//         System.out.println("final i valur or total value is "+get(5,1));
//     }
// }
















// /**
//  * Cj22_method_recursion
//  */
// public class Cj22_method_recursion
// {
//     public static int sum(int start,int end)
//     {
//         System.out.println(end);
//         if (end>=start)
//         {
            
//             return end+sum(start, end-1);
            
//         }
//         return end;

//     }
//     public static void main(String[] args)
//     {
//         System.out.println(sum(5,10));    
//     }
    
// }



























// WAP to print prime numbers 1 to 1000.
