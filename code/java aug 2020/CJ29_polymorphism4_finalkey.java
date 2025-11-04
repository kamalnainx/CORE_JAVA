// what is final keyword in core java?
// final keyword in java is use for restrict the user to use code or data like:-
// variable        methed      class


// public class CJ29_polymorphism4_finalkey
// {
//     int age=100;
//     void userage()
//     {
//         age=110;
//         System.out.println(age);
//     }
//     public static void main(String[] args)
//     {
//         CJ29_polymorphism4_finalkey cj29pf_1 = new CJ29_polymorphism4_finalkey();
//         cj29pf_1.userage();
//     }    
// }










// public class CJ29_polymorphism4_finalkey
// {
//     final int age=100;//use final
//     void userage()
//     {
//         age=110;
//         System.out.println(age);
//     }
//     public static void main(String[] args)
//     {
//         CJ29_polymorphism4_finalkey cj29pf_1 = new CJ29_polymorphism4_finalkey();
//         cj29pf_1.userage();
//     }    
// }











// /**
//  * age
//  */
// class Age
// {
//     void age() // without final no error
//     {
//        System.out.println(100);//use final
//     }
// }

// public class CJ29_polymorphism4_finalkey extends Age
// {
//     void age()
//     {
//         System.out.println(110);
//     }
//     public static void main(String[] args)
//     {
//         CJ29_polymorphism4_finalkey cj29pf_1 = new CJ29_polymorphism4_finalkey();
//         cj29pf_1.age();
//     }    
// }













// /**
//  * age
//  */
// class Age
// {
//     final void age() //final use
//     {
//        System.out.println(100);//use final
//     }
// }

// public class CJ29_polymorphism4_finalkey extends Age
// {
//     void age() //error
//     {
//         System.out.println(110);
//     }
//     public static void main(String[] args)
//     {
//         CJ29_polymorphism4_finalkey cj29pf_1 = new CJ29_polymorphism4_finalkey();
//         cj29pf_1.age();
//     }    
// }











// /**
//  * age
//  */
// class Age
// {
//     void age()
//     {
//        System.out.println("this is final user age 100");
//     }
// }

// public class CJ29_polymorphism4_finalkey extends Age
// {
//     void age()
//     {
//         System.out.println("but we can change age to 110");
//     }
//     public static void main(String[] args)
//     {
//         CJ29_polymorphism4_finalkey cj29pf_1 = new CJ29_polymorphism4_finalkey();
//         cj29pf_1.age();
//     }    
// }












// /**
//  * age
//  */
// final class Age //final use
// {
//     void age()
//     {
//        System.out.println("this is final user age 100");
//     }
// }

// public class CJ29_polymorphism4_finalkey extends Age //error
// {
//     void age()
//     {
//         System.out.println("but we can change age to 110");
//     }
//     public static void main(String[] args)
//     {
//         CJ29_polymorphism4_finalkey cj29pf_1 = new CJ29_polymorphism4_finalkey();
//         cj29pf_1.age();
//     }    
// }












// /**
//  * userage
//  */
// class userage
// {
//     final void age()
//     {
//         System.out.println("user age is 100");
//     }

    
// }
// /**
//  * CJ29_polymorphism4_finalkey
//  */
// public class CJ29_polymorphism4_finalkey extends userage
// {
//     public static void main(String[] args)
//     {
//         CJ29_polymorphism4_finalkey cj29pf_1 =new CJ29_polymorphism4_finalkey();
//         cj29pf_1.age();
//     }
    
// }











// /**
//  * userage
//  */
// class userage
// {
//     final int age=100;
//     void show()
//     {
//         System.out.println(age);
//     }   
// }
// /**
//  * CJ29_polymorphism4_finalkey
//  */
// public class CJ29_polymorphism4_finalkey extends userage
// {
//     public static void main(String[] args)
//     {
//         CJ29_polymorphism4_finalkey cj29pf_1 =new CJ29_polymorphism4_finalkey();
//         cj29pf_1.show();
//     }    
// }
