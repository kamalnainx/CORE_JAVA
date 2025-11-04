// import java.io.file;
// file f1= new file("file/demo1.txt");

// file
// 1. create/ write
// 2. read
// 3. delete


// import java.io.File;// import file class
// import java.io.IOException;//import ioexception class for handle error
// /**
//  * Cj39_file_handling
//  */
// public class Cj39_file_handling
// {
//     public static void main(String[] args)
//     {
//         try
//         {
//             File myobj = new File("file/demo1.txt"); 
//             if (myobj.createNewFile())
//             {
//                 System.out.println("file created "+myobj.getName());
//             }
//             else
//             {
//                 System.out.println("file is already exists");
//             }
//         }
//         catch (Exception e)
//         {
//             System.out.println("an error occurred");
//             e.printStackTrace();
//         }
//     }
    
// }











// import java.io.File;// import file class
// import java.io.FileWriter;
// import java.io.IOException;//import ioexception class for handle error
// /**
//  * Cj39_file_handling
//  */
// public class Cj39_file_handling
// {
//     public static void main(String[] args)
//     {
//         try
//         {
//             FileWriter myobj = new FileWriter("file/demo1.txt"); 
//             myobj.write("this is my first file from java files");
//             myobj.close();
//             System.out.println("add data to file successfully");
//         }
//         catch (Exception e)
//         {
//             System.out.println("an error occurred");
//             e.printStackTrace();
//         }
//     }
    
// }

























// read file data
// import java.io.File;
// import java.io.FileNotFoundException;
// import java.util.Scanner;

// /**
//  * Cj39_file_handling
//  */
// public class Cj39_file_handling
// {

//     public static void main(String[] args)
//     {
//         try {
//             File myobj = new File("file/demo1.txt");
//             Scanner myreader = new Scanner(myobj);
//             while (myreader.hasNextLine()) 
//             {
//                 String data= myreader.nextLine();
//                 System.out.print(data);
//             }
//             myreader.close();
//         }
//         catch (FileNotFoundException e)
//         {
//             System.out.println("an error occurred");
//             e.printStackTrace();
//         }
//     }
// }




















// print file info
// import java.io.File;
// import java.io.FileNotFoundException;
// import java.util.Scanner;

// /**
//  * Cj39_file_handling
//  */
// public class Cj39_file_handling
// {

//     public static void main(String[] args)
//     {
//         try {
//             File myobj = new File("file/demo1.txt");
//             if (myobj.exists())
//             {
//                 System.out.println("file name "+myobj.getName());
//                 System.out.println("absolute path "+myobj.getAbsolutePath());
//                 System.out.println("writerable "+myobj.canWrite());
//                 System.out.println("readable "+myobj.canRead());
//                 System.out.println("file size "+myobj.length());
                    
//             }
//             else
//             {
//                 System.out.println("file not found");    
//             }
//             Scanner myreader = new Scanner(myobj);
//             while (myreader.hasNextLine()) 
//             {
//                 String data= myreader.nextLine();
//                 System.out.print(data);
//             }
//             myreader.close();
//         }
//         catch (FileNotFoundException e)
//         {
//             System.out.println("an error occurred");
//             e.printStackTrace();
//         }
//     }
// }

























































// //file delete
// import java.io.File;

// /**
//  * Cj39_file_handling
//  */
// public class Cj39_file_handling
// {

//     public static void main(String[] args)
//     {
//         File myobj = new File("file/demo1.txt");
//         if (myobj.delete())
//         {
//             System.out.println("file is deleted "+ myobj.getName());    
//         }
//         else 
//         {
//             System.out.println("file not found");                
//         }   
//     }
// }




























//file delete
import java.io.File;

/**
 * Cj39_file_handling
 */
public class Cj39_file_handling
{

    public static void main(String[] args)
    {
        File myobj = new File("D:\\java\\code\\java sep 2021\\file");
        if (myobj.delete())
        {
            System.out.println("folder is deleted "+ myobj.getName());    
        }
        else 
        {
            System.out.println("folder not found");                
        }   
    }
}









