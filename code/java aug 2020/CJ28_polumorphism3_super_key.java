// what is super keyword?
// the super keyword is use for reference variable in java.
// the super keyword use to refer immediate parent class object.


// /**
//  * sound
//  */
// class sound
// {
//     String type1="mp3";
// }
// /**
//  * song
//  */
// class song extends sound
// {
//     String type1="ogg";
//     void songtype1()
//     {
//         System.out.println(type1);
//         System.out.println(super.type1);
//     }
// }
// public class CJ28_polumorphism_super_key
// {
//     public static void main(String[] args)
//     {
//         song s = new song();
//         s.songtype1();
//     }    
// }







// /**
//  * sound
//  */
// class sound
// {
//     void type1()
//     {
//        System.out.println("mp3");
//     }
// }
// /**
//  * song
//  */
// class song extends sound
// {
//     void type1()
//     {
//        System.out.println("ogg");
//     }
//     void songtype1()
//     {
//         System.out.println("sound type");
//     }

//     void print()
//     {
//         super.type1();
//         type1();
        
//     }
// }

// public class CJ28_polumorphism_super_key
// {
//     public static void main(String[] args)
//     {
//         song s = new song();
//         s.print();
//     }    
// }










// /**
//  * sound
//  */
// class sound
// {
//     sound()
//     {
//         System.out.println("mp3");
//     }
// }
// /**
//  * song
//  */
// class song extends sound
// {
//     song()
//     {
//         super();
//         System.out.println("koi mil gaya.");
//     }
// }
// /**
//  * CJ28_polumorphism_super_key
//  */
// public class CJ28_polumorphism_super_key
// {

//     public static void main(String[] args)
//     {
//         song s = new song();
            
//     }
// }