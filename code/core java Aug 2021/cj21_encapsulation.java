// Encapsulation

// The meaning of Encapsulation, is to make sure that "sensitive" data is hidden from users. To achieve this, you must:

// declare class variables/attributes as private

// provide public get and set methods to access and update the value of a private variable

// Get and Set

// You learned from the previous chapter that private variables can only be accessed within the same class (an outside class has no access to it). However, it is possible to access them if we provide public get and set methods.
// The get method returns the variable value, and the set method sets the value.
// Syntax for both is that they start with either get or set, followed by the name of the variable, with the first letter in upper case:

// /**
//  * cj21_encapsulation
//  */
// public class cj21_encapsulation
// {

//     public static void main(String[] args)
//     {
//         int i = 10;
//         System.out.println("hello world");
//         System.out.println("the value of i is"+i);
//     }
// }




































// /**
//  * cj21_encapsulation
//  */
// class cj21_encapsulation
// {

//     public static void main(String[] args)
//     {
//         int i = 10;
//         System.out.println("hello world");
//         System.out.println("the value of i is"+i);
//     }
// }






































// // public class Person { private String name; // Getter public String getName() { return name; } // Setter public void setName(String newName) { this.name = newName; } }

// /**
//  * Innercj21_encapsulation
//  */
// class Innercj21_encapsulation
// {
//     int i = 10;
    
// }

// /**
//  * cj21_encapsulation
//  */
// public class cj21_encapsulation
// {

//     public static void main(String[] args)
//     {
//         Innercj21_encapsulation icj21_1 = new Innercj21_encapsulation();
//         System.out.println("hello world");
//         System.out.println("the value of i is"+icj21_1.i);
//     }
// }


























// /**
//  * Innercj21_encapsulation
//  */
// class Innercj21_encapsulation
// {
//     private int age;
//     public int getname()
//     {
//         return age;
//     }

//     public void setname(int age1)
//     {
//         age=age1;
//         // System.out.println(age);
//     }

// }

// /**
//  * cj21_encapsulation
//  */
// public class cj21_encapsulation
// {

//     public static void main(String[] args)
//     {
//         Innercj21_encapsulation icj21_1 = new Innercj21_encapsulation();
//         icj21_1.setname(10);
//         // System.out.println("the value of i is"+icj21_1.i);
//         System.out.println("the age is : "+icj21_1.getname());
//     }
// }























// Why Encapsulation?
// Better control of class attributes and methods
// Class attributes can be made read-only (if you only use the get method), or write-only (if you only use the set method)
// Flexible: the programmer can change one part of the code without affecting other parts
// Increased security of data