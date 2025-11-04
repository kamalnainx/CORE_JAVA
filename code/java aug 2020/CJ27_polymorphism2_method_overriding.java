// /**
//  * InnerCJ27_polymorphism_method_overriding
//  */
// class InnerCJ27_polymorphism_method_overriding
// {
//     void show()
//     {
//         System.out.println("this is inner cj 27 class function");
//     }
    
// }
// /**
//  * CJ27_polymorphism_method_overriding
//  */
// public class CJ27_polymorphism_method_overriding extends InnerCJ27_polymorphism_method_overriding
// {

//     public static void main(String[] args)
//     {
//         CJ27_polymorphism_method_overriding cj27pmo_1= new CJ27_polymorphism_method_overriding();
//         cj27pmo_1.show();
//     }
// }











// /**
//  * InnerCJ27_polymorphism_method_overriding
//  */
// class InnerCJ27_polymorphism_method_overriding
// {
//     void show()
//     {
//         System.out.println("this is inner cj 27 class function");
//     }
    
// }
// /**
//  * CJ27_polymorphism_method_overriding
//  */
// public class CJ27_polymorphism_method_overriding extends InnerCJ27_polymorphism_method_overriding
// {
//     void show()
//     {
//         System.out.println("this is cj 27 main class function");
//     }
//         public static void main(String[] args)
//     {
//         CJ27_polymorphism_method_overriding cj27pmo_1= new CJ27_polymorphism_method_overriding();
//         cj27pmo_1.show();
//     }
// }









// /*
//  * loan
//  */
// class loan
// {
//     int roi()
//     {
//         return 0;
//     }
// }
// /*
//  * edu
//  */
// class edu extends loan
// {
//     int roi()
//     {
//         return 2;
//     }
// }
// /*
//  * home
//  */
// class home extends loan
// {
//     int roi()
//     {
//         return 8;
//     }
// }
// /*
//  * car
//  */
// class car extends loan
// {
//     int roi()
//     {
//         return 11;
//     }
// }


// /**
//  * CJ27_polymorphism_method_overriding
//  */
// public class CJ27_polymorphism2_method_overriding
// {
//     public static void main(String[] args)
//     {
//         edu     e = new     edu();
//         home    h = new     home();
//         car     c = new     car();

//         System.out.println("rate of interest for edu "+e.roi()+"%");
//         System.out.println("rate of interest for home "+h.roi()+"%");
//         System.out.println("rate of interest for car "+c.roi()+"%");
        
//     }
    
// }