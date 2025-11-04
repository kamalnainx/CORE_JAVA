// import java.io.File;
// import java.io.IOException;
// /**
//  * CJ34_file_Handling
//  */
// public class CJ34_file_Handling {

//     public static void main(String[] args) {
//         try
//         {
//             File myobj = new File("fileinfo/demo1.txt");
//             if (myobj.createNewFile())
//             {
//                 System.out.println("file created"+myobj.getName());    
//             }
//             else
//             {
//                 System.out.println("file already exists.");
//             }
//         }
//         catch(IOException e)
//         {
//             System.out.println("an error occurred.");
//             e.printStackTrace();
//         }
//     }
// }






















// import java.io.File;
// import java.io.FileWriter;
// import java.io.IOException;
// /**
//  * CJ34_file_Handling
//  */
// public class CJ34_file_Handling {

//     public static void main(String[] args) {
//         try
//         {
//             FileWriter mywriter = new FileWriter("fileinfo/demo1.txt");
//             mywriter.write("this is my first file by core java.");
//             mywriter.close();

//             System.out.println("file is created.");
//         }
//         catch(IOException e)
//         {
//             System.out.println("an error occurred.");
//             e.printStackTrace();
//         }
//     }
// }


























// import java.io.File;
// import java.io.FileWriter;
// import java.io.IOException;
// /**
//  * CJ34_file_Handling
//  */
// public class CJ34_file_Handling {

//     public static void main(String[] args) {
//         try
//         {
//             FileWriter mywriter = new FileWriter("fileinfo/demo1.txt");
//             mywriter.write("this is my first file by core java.");
//             mywriter.write("this is my first file by core java.");
//             mywriter.close();

//             System.out.println("file is created.");
//         }
//         catch(IOException e)
//         {
//             System.out.println("an error occurred.");
//             e.printStackTrace();
//         }
//     }
// }

























// import java.io.File;
// import java.io.FileWriter;
// import java.io.IOException;
// /**
//  * CJ34_file_Handling
//  */
// public class CJ34_file_Handling {

//     public static void main(String[] args) {
//         try
//         {
//             FileWriter mywriter = new FileWriter("fileinfo/demo1.txt");
//             mywriter.write("this is my first file by core java.\n");
//             mywriter.write("this is my first file by core java.");
//             mywriter.close();

//             System.out.println("file is created.");
//         }
//         catch(IOException e)
//         {
//             System.out.println("an error occurred.");
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
//  * CJ34_file_Handling
//  */
// public class CJ34_file_Handling {

//     public static void main(String[] args) {
//         try
//         {
//             File myobj = new File("fileinfo/demo1.txt");
//             Scanner myreader = new Scanner(myobj);

//             while (myreader.hasNextLine())
//             {
//                 String data= myreader.nextLine();
//                 System.out.println(data);    
//             }
//             myreader.close();
//         }    
//         catch(IOException e)
//         {
//             System.out.println("an error occurred.");
//             e.printStackTrace();
//         }
//     }
// }



















// import java.io.File;

// /**
//  * CJ34_file_Handling
//  */
// public class CJ34_file_Handling {

//     public static void main(String[] args) {
//             File myobj = new File("fileinfo/demo1.txt");
//             if (myobj.exists())
//             {
//                 System.out.println("file name\t"+myobj.getName());
//                 System.out.println("absolute path\t"+myobj.getAbsolutePath());
//                 System.out.println("Writerable\t"+myobj.canWrite());
//                 System.out.println("readable\t"+myobj.canRead());
//                 System.out.println("file size name\t"+myobj.length());
//             }
//             else
//             {
//                 System.out.println("the file is not found");
//             }
//     }
// }



























// import java.io.File;

// /**
//  * CJ34_file_Handling
//  */
// public class CJ34_file_Handling {

//     public static void main(String[] args) {
//             File myobj = new File("fileinfo/demo1.txt");
//             if (myobj.delete())
//             {
//                 System.out.println("delete the file\t"+myobj.getName());
//             }
//             else
//             {
//                 System.out.println("failed to delete");
//             }
//     }
// }































// import java.io.File;

// /**
//  * CJ34_file_Handling
//  */
// public class CJ34_file_Handling {

//     public static void main(String[] args)
//     {
//             File myobj = new File("D:\\java\\code\\java march weekend 2021\\fileinfo");
//             if (myobj.delete())
//             {
//                 System.out.println("delete the file\t"+myobj.getName());
//             }
//             else
//             {
//                 System.out.println("failed to delete");
//             }
//     }
// }
