// lambda in java
// a lambda is a short block of code which takes in parameters and returns a vlaue.
// lambda are similar to function/methods, but they do not need a name and they be implemented right in body of a method.


// syntax:-
// parameter->expression

//(parameter1, parameter2)->expression

//(parameter1, parameter2)->{block of code}








// import java.util.ArrayList;
// /**
//  * Cj42_lambda_expressions
//  */
// public class Cj42_lambda_expressions
// {
//     public static void main(String[] args)
//     {
//         ArrayList<Integer> al1= new ArrayList<Integer>();
//         al1.add(10);
//         System.out.println(al1);
//     }
    
// }
















// import java.util.ArrayList;
// /**
//  * Cj42_lambda_expressions
//  */
// public class Cj42_lambda_expressions
// {
//     public static void main(String[] args)
//     {
//         ArrayList<Integer> al1= new ArrayList<Integer>();
//         al1.add(10);
//         al1.add(5);
//         al1.add(50);
//         al1.add(25);
//         al1.add(75);
//         System.out.println(al1);
//         // System.out.println(al1[2]);//error not work in java list
        
//     }
    
// }






























// import java.util.ArrayList;
// /**
//  * Cj42_lambda_expressions
//  */
// public class Cj42_lambda_expressions
// {
//     public static void main(String[] args)
//     {
//         ArrayList<Integer> al1= new ArrayList<Integer>();
//         al1.add(10);
//         al1.add(5);
//         al1.add(50);
//         al1.add(25);
//         al1.add(75);
//         System.out.println(al1);
//         al1.forEach((n)->{System.out.println(n);});        
//         al1.forEach((n)->{System.out.print(n+"\t");});        
//     }   
// }































// import java.util.ArrayList;
// import java.util.function.Consumer;
// /**
//  * Cj42_lambda_expressions
//  */
// public class Cj42_lambda_expressions
// {
//     public static void main(String[] args)
//     {
//         ArrayList<Integer> al1= new ArrayList<Integer>();
//         al1.add(10);
//         al1.add(5);
//         al1.add(50);
//         al1.add(25);
//         al1.add(75);


//         Consumer<Integer> method =(n)->{System.out.print(n+"\t");};
//         al1.forEach(method);        
//     }   
// }





























// interface Stringfunction
// {
//     String run(String str);
// }
// /**
//  * Cj42_lambda_expressions
//  */
// public class Cj42_lambda_expressions
// {

//     public static void main(String[] args)
//     {
//         Stringfunction sf1=(s)->s+"!!!";
//         Stringfunction sf2=(s)->s+"@@@";

//         printtype("hello ", sf1);
//         printtype("hello ", sf2);
        
//     }
//     public static void printtype(String str, Stringfunction type)
//     {
//         String output= type.run(str);
//         System.out.println(output);
//     } 
// }