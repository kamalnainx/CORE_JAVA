// import java.util.ArrayList;

// /**
//  * CJ33_Lambda
//  */
// public class CJ33_Lambda
// {
//     public static void main(String[] args)
//     {
//         ArrayList<Integer> num1= new ArrayList<Integer>();    
//         num1.add(5);
//         num1.add(1);
//         num1.add(4);
//         num1.add(3);
//         num1.add(2);
//         num1.forEach(
//             (n) ->
//             {
//                 System.out.println(n);
//             }
//         );
        
//     }
    
// }
























// import java.util.ArrayList;
// import java.util.function.Consumer;
// /**
//  * CJ33_Lambda
//  */
// public class CJ33_Lambda
// {
//     public static void main(String[] args)
//     {
//         ArrayList<Integer> num1= new ArrayList<Integer>();    
//         num1.add(5);
//         num1.add(1);
//         num1.add(4);
//         num1.add(3);
//         num1.add(2);
//         Consumer<Integer> c1=(n) ->
//             {
//                 System.out.println(n);
//             };
//         num1.forEach(c1);
//     }
// }




























// interface StringFunction
// {
//     String run(String str);
// }
// /**
//  * CJ33_Lambda
//  */
// public class CJ33_Lambda {

//     public static void main(String[] args)
//     {
//         StringFunction exclaim=(s) -> s + "!";
//         StringFunction ask=(s) -> s + "?";
//         printFormatted("hello ", exclaim);
//         printFormatted("hello ", ask);
//     }

//     public static void printFormatted(String str, StringFunction format)
//     {
//         String result =format.run(str);
//         System.out.println(result);
//     }
// }