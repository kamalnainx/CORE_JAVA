// import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

// /**
//  * Innerpolymorphism1

//  */
// class Innerpolymorphism1
// {
//     public void sound() 
//     {
//         System.out.println("the sound for Innerpolymorphism1.");
//     }
// }


// /**
//  * Innerpolymorphism1_1
 
//  */
// class Innerpolymorphism1_1 extends Innerpolymorphism1
// {
//     public void sound() 
//     {
//         System.out.println("the sound for Innerpolymorphism1_1 class.");
//     }

// }

// /**
//  * Innerpolymorphism1_2
//  */
// class Innerpolymorphism1_2 extends Innerpolymorphism1
// {
//     public void sound() 
//     {
//         System.out.println("the sound for Innerpolymorphism1_2 class.");
//     }
 
// }

// /**
//  * Innerpolymorphism1_3
//  */
// class Innerpolymorphism1_3 extends Innerpolymorphism1
// {
//     public void sound() 
//     {
//         System.out.println("the sound for Innerpolymorphism1_3 class.");
//     }

// }
// class polymorphism1
// {
//     public static void main(String[] args)
//     {
//         Innerpolymorphism1 ipmp1 =new Innerpolymorphism1();
//         Innerpolymorphism1 ipmp1_1 =new Innerpolymorphism1_1();
//         Innerpolymorphism1 ipmp1_2 =new Innerpolymorphism1_2();
//         Innerpolymorphism1 ipmp1_3 =new Innerpolymorphism1_3();
        
//         ipmp1.sound();
//         ipmp1_1.sound();
//         ipmp1_2.sound();
//         ipmp1_3.sound();
        
//     }
    
// }







// /**
//  * Add1
//  */
//  class Add1
//  {
//     static String add()
//     {
//         return "i+j";
//     }
//     static int add(int i, int j)
//     {
//         return i+j;
//     }
//     static int add(int i, int j, int k)
//     {
//         return i+j+k;
//     }
//     static void add(String name1, int age, double marks)
//     {
//         System.out.println("User name is "+name1+" user age is "+age+" and marks is "+marks );
//     }
    
// }
// /**
//  * polymorphism1
//  */
// public class polymorphism1 
// {
//     public static void main(String[] args)
//     {
        
//         System.out.println(Add1.add());
//         System.out.println(Add1.add(5, 10));
//         System.out.println(Add1.add(50, 100));
        
//         System.out.println(Add1.add(5, 10, 15));
//         Add1.add("kamal",100,87.98);
//     }
    
// }
