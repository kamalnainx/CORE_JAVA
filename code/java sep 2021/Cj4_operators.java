// /**
//  * Cj4.operators
//  */
// public class Cj4_operators
// {

//     public static void main(String[] args)
//     {
//         int i,j;
//         i=10;
//         j=20;
//         System.out.println("sum of i and j " + (i+j));    
//     }
// }



































// /**
//  * Cj4.operators
//  */
// public class Cj4_operators
// {

//     public static void main(String[] args)
//     {
//         int i,j,k;
//         i=10;
//         j=20;
//         k=i+j;
//         System.out.println("sum of i and j " + k);    
//     }
// }



































// /**
//  * Cj4.operators
//  */
// public class Cj4_operators
// {

//     public static void main(String[] args)
//     {
//         int i,j,total,multi,sub,div,mod;
        
//         i=10;
//         j=3;
//         System.out.println("the value of i is: "+i+" and j is :- "+j);

//         total=i+j;
//         System.out.println("toatl of i and j " + total);    

//         multi=i*j;
//         System.out.println("Multiplication of i and j " + multi);    

//         sub=i-j;
//         System.out.println("subtraction of i and j " + sub);    

//         div=i/j;
//         System.out.println("DIVISION of i and j " + div);    

//         mod=i%j;
//         System.out.println("modulus of i and j " + mod);    
//     }
// }




















// /**
//  * Cj4.operators
//  */
// public class Cj4_operators
// {

//     public static void main(String[] args)
//     {
//         int i,j,total,multi,sub,div,mod;
        
//         i=10;
//         j=3;
//         System.out.println("the value of i is: "+i+" and j is :- "+j);

//         i=i+j;// 10 +3=13
//         System.out.println("toatl of i and j " + i);    //i=13

//         i=i*j;//13*3=39 i=39
//         System.out.println("Multiplication of i and j " + i);    //39

//         i=i-j; //39-3=36
//         System.out.println("subtraction of i and j " + i);    //36

//         i=i/j; //36/3=12
//         System.out.println("DIVISION of i and j " + i);    //12

//         i=i%j; // 12/3=4 r=0
//         System.out.println("modulus of i and j " + i);    //0
//     }
// }




















// /**
//  * Cj4.operators
//  */
// public class Cj4_operators
// {

//     public static void main(String[] args)
//     {
//         int i,j,total,multi,sub,div,mod;
        
//         i=10;
//         j=3;
//         System.out.println("the value of i is: "+i+" and j is :- "+j);

//         i+=j;// 10 +3=13
//         System.out.println("toatl of i and j " + i);    //i=13

//         i*=j;//13*3=39 i=39
//         System.out.println("Multiplication of i and j " + i);    //39

//         i-=j; //39-3=36
//         System.out.println("subtraction of i and j " + i);    //36

//         i/=j; //36/3=12
//         System.out.println("DIVISION of i and j " + i);    //12

//         i%=j; // 12/3=4 r=0
//         System.out.println("modulus of i and j " + i);    //0
        
//         i=5;    j=7;
//         i&=j; 
//         System.out.println("modulus of i and j " + i);    
        
//         i=5;    j=3;
//         i|=j; 
//         System.out.println("modulus of i and j " + i);    
        
//     }
// }





























































// // comparison operators
// // ==, !=, >, >=, <, <=

// /**
//  * Cj4_operators
//  */
// public class Cj4_operators {

//     public static void main(String[] args) {
//         int i=10,j=20;
//         System.out.println(i==j);//f
//         System.out.println(i!=j);//t
//         System.out.println(i>j);//f
//         System.out.println(i>=j);//f  >= > or ==
//         System.out.println(i<j);//t
//         System.out.println(i<=j);//t
//     }
// }
































// // logical operators
// // &&(and), ||(or), !(not)

// /**
//  * Cj4_operators
//  */
// public class Cj4_operators {

//     public static void main(String[] args) {
//         int i=10,j=20;
        
//         System.out.println("And(&&):-all true ");
//         System.out.println(i==j && i!=j);//f
//         System.out.println(i>j && i>=j);//f
//         System.out.println(i<j && i<=j);//t

//         System.out.println("or(||):-anyone true ");
//         System.out.println(i==j || i!=j);//t
//         System.out.println(i>j || i>=j);//f
//         System.out.println(i<j || i<=j);//t

//         System.out.println("only not "+(!(i<j)));

//         System.out.println("not with And(&&):-all true ");
//         System.out.println(!(i==j && i!=j && i<j));//t
//         System.out.println(!(i>j && i>=j));//t
//         System.out.println(!(i<j && i<=j));//f

//         System.out.println("not with or(||):-anyone true ");
//         System.out.println(!(i==j || i!=j ));//t
//         System.out.println(!(i>j || i>=j));//f
//         System.out.println(!(i<j || i<=j));//t
      
//     }
// }

































































// // logical operators
// // &&(and), ||(or), !(not)

// /**
//  * Cj4_operators
//  */
// public class Cj4_operators {

//     public static void main(String[] args) {
//         System.out.println(1>2);
//         System.out.println(1>2||3>1);
//         System.out.println(1>2||3>1||9<2);
//         System.out.println(1>2||3>1&&9<2);
//         System.out.println(1>2||3>1&&9>2);
//         System.out.println(1>2&&3>1||9<2);
//         System.out.println(1<2&&(3>1||9<2));   
//     }
// }






// Q WAP to find the area of square?
// Q WAP to find the area of circle?
// Q WAP to add all sub marks and then find avg.
// Q WAP to to find the rate of intrest for 100000 loan amount with 12.25%.
// Q WAP to to find the rate of intrest for 100000 loan amount with 12.25% and time is 4years.
// Q WAP to to find the dustance from time and speed(value selected by user).
// Q WAP to (a+b)2?
