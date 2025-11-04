// import java.io.File;


// /**
//  * cj31_file_handling
//  */
// public class cj31_file_handling {

//     public static void main(String[] args)
//     {
        
//         try
//         {
//             File f1=new File("demo/demo1.txt");
//             if(f1.createNewFile())
//             {
//                 System.out.println("file is created: "+f1.getName());
//             }
//             else
//             {
//                 System.out.println("file already there.");
//             }
//         }
//         catch (Exception e)
//         {
//             System.out.println("there is some error.");
//             e.printStackTrace();
//         }    
//     }
// }
                    


















// import java.io.File;
// import java.io.IOException;

// /**
//  * cj31_file_handling
//  */
// public class cj31_file_handling {

//     public static void main(String[] args)
//     {
//         try
//         {
//             File f1=new File("demo\\demo2.txt");
//             if(f1.createNewFile())
//             {
//                 System.out.println("file is created: "+f1.getName());
//                 System.out.println("file is created: "+f1.getAbsolutePath());
                
//             }
//             else
//             {
//                 System.out.println("file already there.");
//             }
//         }
//         catch (Exception e)
//         {
//             System.out.println("there is some error.");
//             e.printStackTrace();
//         }    
//     }
// }



















// // import java.io.File;
// import java.io.FileWriter;
// import java.io.IOException;

// /**
//  * cj31_file_handling
//  */
// public class cj31_file_handling {

//     public static void main(String[] args)
//     {
//         try
//         {
//             // File f1=new File("demo\\demo2.txt");
//             FileWriter f1= new FileWriter("demo\\demo1.txt");
//             f1.write("this is my first demo file by core java.");
//             f1.close();
//             System.out.println("file data added.");
//             // if(f1.createNewFile())
//             // {
//             //     System.out.println("file is created: "+f1.getName());
//             //     System.out.println("file is created: "+f1.getAbsolutePath());
                
//             // }
//             // else
//             // {
//             //     System.out.println("file already there.");
//             // }
//         }
//         catch (Exception e)
//         {
//             System.out.println("there is some error.");
//             e.printStackTrace();
//         }    
//     }
// }
































































// import java.io.File;
// import java.io.FileWriter;
// import java.io.IOException;

// /**
//  * cj31_file_handling
//  */
// public class cj31_file_handling {

//     public static void main(String[] args)
//     {
//         try
//         {
//             // File f1=new File("demo\\demo3.txt");
//             FileWriter fw1= new FileWriter("demo\\demo2.txt");
//             // if(f1.createNewFile())
//             // {
//             //     System.out.println("file is created: "+f1.getName());
//             //     System.out.println("file is created: "+f1.getAbsolutePath());
//             //     System.out.println();
//                 fw1.write("this is my first demo file by core java.");
//                 fw1.close();
//                 System.out.println("file data added.");
//             // }
//             // else
//             // {
//             //     System.out.println("file already there.");
//             // }
//         }
//         catch (Exception e)
//         {
//             System.out.println("there is some error.");
//             e.printStackTrace();
//         }    
//     }
// }

































































// import java.io.File;
// // import java.io.FileWriter;
// import java.io.IOException;
// import java.io.FileNotFoundException;
// import java.util.Scanner;

// /**
//  * cj31_file_handling
//  */
// public class cj31_file_handling {

//     public static void main(String[] args)
//     {
//         try
//         {
//             File f1=new File("demo\\demo1.txt");
//             Scanner s1 = new Scanner(f1);
//             while (s1.hasNextLine())
//             {
//                 String data=s1.nextLine();
//                 System.out.println(data);
//             }
//             // FileWriter fw1= new FileWriter("demo\\demo2.txt");
//             // if(f1.createNewFile())
//             // {
//             //     System.out.println("file is created: "+f1.getName());
//             //     System.out.println("file is created: "+f1.getAbsolutePath());
//             //     System.out.println();
//                 // fw1.write("this is my first demo file by core java.");
//                 // fw1.close();
//                 // System.out.println("file data added.");
//             // }
//             // else
//             // {
//             //     System.out.println("file already there.");
//             // }
//         }
//         catch (Exception e)
//         {
//             System.out.println("there is some error.");
//             e.printStackTrace();
//         }    
//     }
// }























































// import java.io.File;
// import java.io.FileWriter;
// import java.io.IOException;
// import java.io.FileNotFoundException;
// import java.util.Scanner;

// /**
//  * cj31_file_handling
//  */
// public class cj31_file_handling {

//     public static void main(String[] args)
//     {
//         try
//         {
//             File f1=new File("demo\\demo1.txt");
//             Scanner s1 = new Scanner(f1);
//             while (s1.hasNextLine())
//             {
//                 String data=s1.nextLine();
//                 System.out.println(data);
//             }
//             // FileWriter fw1= new FileWriter("demo\\demo2.txt");
//             if(f1.exists())
//             {
//                 System.out.println("file is created: "+f1.getName());
//                 System.out.println("file is created: "+f1.getAbsolutePath());
//                 System.out.println("file is created: "+f1.canRead());
//                 System.out.println("file is created: "+f1.canWrite());
//                 System.out.println("file is created: "+f1.length());
                
                
//             //     System.out.println();
//                 // fw1.write("this is my first demo file by core java.");
//                 // fw1.close();
//                 // System.out.println("file data added.");
//             }
//             else
//             {
//                 System.out.println("file already there.");
//             }
//         }
//         catch (Exception e)
//         {
//             System.out.println("there is some error.");
//             e.printStackTrace();
//         }    
//     }
// }



















































// import java.io.File;

// /**
//  * cj31_file_handling
//  */
// public class cj31_file_handling {

//     public static void main(String[] args)
//     {
//         File f1= new File("demo/demo2.txt");
//         if (f1.delete())
//         {
//             System.out.println("file is deleted.");
//         }
//         else
//         {
//             System.out.println("file is not deleted.");    
//         }
//     }
// }



















































































import java.io.File;

/**
 * cj31_file_handling
 */
public class cj31_file_handling {

    public static void main(String[] args)
    {
        File f1= new File("demo\\");
        if (f1.delete())
        {
            System.out.println("file is deleted.");
        }
        else
        {
            System.out.println("file is not deleted.");    
        }
    }
}
