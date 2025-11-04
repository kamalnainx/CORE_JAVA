// /**
//  * Innerpolymorphismmethod
//  */
// class Innerpolymorphismmethod
// {
//     void run()
//     {
//         System.out.println("run this innerpolymorphism method");
//     }
    
// }

// class polymorphismmethod extends Innerpolymorphismmethod
// {
//     public static void main(String[] args)
//     {
//         polymorphismmethod plmp1=new polymorphismmethod();
//         plmp1.run();   
        
//     }
    
// }





// /**
//  * Innerpolymorphismmethod
//  */
// class Innerpolymorphismmethod
// {
//     void run()
//     {
//         System.out.println("run this innerpolymorphism method");
//     }
    
// }

// /**
//  * Innerpolymorphismmethod_1
//  */
// class Innerpolymorphismmethod_1 extends Innerpolymorphismmethod
// {
//     void run()
//     {
//         System.out.println("run this innerpolymorphism method _1 "+23*32);
//     }
    
// }

// class polymorphismmethod extends Innerpolymorphismmethod_1
// {
//     public static void main(String[] args)
//     {
//         polymorphismmethod plmp1=new polymorphismmethod();
//         plmp1.run();   
        
//     }
// }






// /**
//  * rbi

//  */
// class rbi 
// {
//     int getroi()
//     {
//         return 1;
//     }
 
// }

// /**
//  * sbi

//  */
// class sbi extends rbi 
// {
//     int getroi()
//     {
//         return 5;
//     }
 
// }


// /**
//  * icici

//  */
// class icici extends rbi 
// {
//     int getroi()
//     {
//         return 12;
//     }
 
// }



// /**
//  * pnb

//  */
// class pnb extends rbi 
// {
//     int getroi()
//     {
//         return 9;
//     }
 
// }


// /**
//  * polymorphismmethod
//  */
// class polymorphismmethod 
// {
//     public static void main(String[] args)
//     {
//         sbi s1=new sbi();
//         System.out.println(s1.getroi());
//         icici c1=new icici();
//         System.out.println(c1.getroi());
//         pnb p1=new pnb();
//         System.out.println(p1.getroi());
        
//     }
    
// }





// /**
//  * Innerpolymorphismmethod
//  */
// class Innerpolymorphismmethod {
//     Innerpolymorphismmethod show()
//     {
//         return this;
//     }
    
// }
// /**
//  * polymorphismmethod
//  */
// public class polymorphismmethod {
// polymorphismmethod show()
// {
//     return this;
// }

// void msg()
// {
//     System.out.println("add msg bottom to top");
// }
//     public static void main(String[] args) 
//     {
//         new polymorphismmethod().show().msg();  
//     }
// }




