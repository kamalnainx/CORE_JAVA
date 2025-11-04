// lambda 
// lambda function/expressions is a short block of code which in parameters and returns a value.
// lambda they do't need a name and they can be implemented right in the body of method.
// sysntax
// parameter -> expression
// parameter1, parameter2 -> expression
// parameter1, parameter2 -> {code block}

// /**
//  * cj32_lambda
//  */
// public class cj32_lambda {
//     static void add1(int i)
//     {
//         System.out.println(i);
//     }
//     public static void main(String[] args) {
//         add1(10);
//         add1(10);
        
//     }
// }



































// import java.util.ArrayList;
// /**
//  * cj32_lambda
//  */
// public class cj32_lambda {
//     static void add1(int i)
//     {
        
//     }
//     public static void main(String[] args) {
//         ArrayList<Integer> al1 = new ArrayList<Integer>();
//         al1.add(10);
//         al1.add(20);
//         al1.forEach((n) -> { System.out.println(n); }); 
//     }
// }


























// import java.util.ArrayList;
// import java.util.function.Consumer;

// /**
//  * cj32_lambda
//  */
// public class cj32_lambda {
//     static void add1(int i)
//     {
        
//     }
//     public static void main(String[] args) {
//         ArrayList<Integer> al1 = new ArrayList<Integer>();
//         al1.add(10);
//         al1.add(20);
//         al1.add(100);
//         al1.add(200);
//         Consumer<Integer> method1 = (n) -> { System.out.println(n); };
//         al1.forEach(method1); 
//     }
// }





























// interface Stringfunction
// {
//     String run(String str);
// }
// /**
//  * cj32_lambda
//  */
// public class cj32_lambda
// {
//     public static void main(String[] args)
//     {
//         Stringfunction sf1= (s) -> s+"!!!";
//         Stringfunction sf2= (s) -> s+"@@@";
        
//         printformat("Hello world", sf1);
//         printformat("Hello world", sf2);
        
//     }
//     public static void printformat(String str, Stringfunction format)
//     {
//         String result1=format.run(str);
//         System.out.println(result1);
//     }
// }




