// /**
//  * cj3_operators
//  */
// public class cj3_operators {

//     public static void main(String[] args) {
//         // int i1=100+100;
//         // System.out.println(i1);
        
//         // int i1=100, i2=100;
//         // System.out.println(i1+i2);

//         int i1=100, i2=100, i3=0;
//         i3=i1+i2;
//         System.out.println("i1 + i2 = i3 :- "+i3);

//     }
// }































// // arithmetic operators
// // +,-,*,/,%
// /**
//  * cj3_operators
//  */
// public class cj3_operators {

//     public static void main(String[] args) {
//         int i=10,j=5;
//         System.out.print("the value of i is "+i);
//         System.out.println("the value of j is "+j);
        
//         System.out.println(i+j);
//         System.out.println(i-j);
//         System.out.println(i*j);
//         System.out.println(i/j);
//         System.out.println(i%j);

//         System.out.println(i++);//print=10 ++ = 1+    1+i     1+10    11  
//         System.out.println(j--);//print=4 -- = 1-    1-j     1-5    4  
//         System.out.println(++i);//++ = 1+    1+i     1+11    12  print=12
//         System.out.println(--j);//-- = 1-    1-j     1-4    3  print=3
                
//     }
// }

























// assigment operators
// =, +=, -=, *=, /=, %=,          &=, |=,        ^=, >>=, <<=
/**
 * cj3_operators
 */
// public class cj3_operators {

//     public static void main(String[] args) {
//         int i=10;
//         System.out.println("the i is value is "+i);
//         int j=i;//j=i   0=10    10
//         System.out.println("the j is value is "+j);
//         System.out.println(i+=j);   //i+=j  i=i+j   i=10+10     i=20
//         System.out.println(i-=j);   //i-=j  i=i-j   i=20-10     i=10
//         System.out.println(i*=j);   //i*=j  i=i*j   i=10*10     i=100
//         System.out.println(i/=j);   //i/=j  i=i/j   i=100/10     i=10
//         System.out.println(i%=j);   //i%=j  i=i%j   i=10%10     i=0

//     }
// }










// public class cj3_operators {

//     public static void main(String[] args) {
//         int i=5, j=3;
//         System.out.println("the i is value is "+i);
        
//         System.out.println("the j is value is "+j);
//         // System.out.println(i&=j);//output 1
//         System.out.println(i|=j);//output 7
        
//     }
// }


























































// // comparison operators
// // ==, !=, <, <=, >, >=

// /**
//  * cj3_operators
//  */
// public class cj3_operators {

//     public static void main(String[] args) {
//         int i=5,j=10;
//         System.out.println("i is "+i+"j is "+j);
//         System.out.println(i!=j);//t
//         System.out.println(i==j);//f
//         System.out.println(i<j);//t
//         System.out.println(i<=j);//t
//         System.out.println(i>j);//f
//         System.out.println(i>=j);//f        
//     }
// }































// logical operators
// &&, ||, !

/**
 * cj3_operators
 */

public class cj3_operators {

    public static void main(String[] args) {
        int i=5,j=10;
        System.out.println("i is "+i+"j is "+j);
        
        // by and
        System.out.println(i!=j&&i==j);//f
        System.out.println(i<j&&i<=j);//t
        System.out.println(i>j&&i>=j);//f        
        System.out.println("by and\n");
        
        // by or
        System.out.println(i!=j||i==j);//t
        System.out.println(i<j||i<=j);//t
        System.out.println(i>j||i>=j);//f        
        System.out.println("by or\n");
        
        System.out.print("\n--------------------------------------------\n");
        
        // by not and
        System.out.println(!(i!=j&&i==j));//f->t
        System.out.println(!(i<j&&i<=j));//t->f
        System.out.println(!(i>j&&i>=j));//f->t        
        System.out.println("by not and\n");
        
        // by not or
        System.out.println(!(i!=j||i==j));//t->f
        System.out.println(!(i<j||i<=j));//t->f
        System.out.println(!(i>j||i>=j));//f->t        
        System.out.println("by not or\n");
        
        

    }
}



