// package mypack;
// import java.util.*;

// /**
//  * Print_your_name
//  */
// public class Print_your_name {

//     static int i,j,k,l,count=6,c=1,c1=10,c2=1,c3=10,c4=11,c5=0,c6=8,a=0;

//     public void Main() 
//     {
//         Scanner scn = new Scanner(System.in);
//         c=1; c1=10; c2=1; c3=10; c4=11;
//         String aa;
//         System.out.print("--------------------------------------------- (-:   Print  Your  Name   :-) ----------------------------------------\n");
//         System.out.print("Enter Name[In lower Case]: ");
//         aa = scn.nextLine();
//         char[] cc=aa.toCharArray();
//         System.out.println("\n");
//         for(i=0;i<=11;i++)
//         {
//             for(a=0;a<cc.length;a++)
//             {
//                 if(cc[a]=='a')
//                 {
//                     crosstr();line();mida();line();crosstl();gap();
//                 }
//                 else if(cc[a]=='b')
//                 {
//                     line();midb();gap();
//                 }
//                 else if(cc[a]=='c')
//                 {
//                     line();midc();gap();
//                 }
//                 else if(cc[a]=='d')
//                 {
//                     line();midd();gap();
//                 }
//                 else if(cc[a]=='e')
//                 {
//                     line();mide();gap();
//                 }
//                 else if(cc[a]=='f')
//                 {
//                     line();midf();gap();
//                 }
//                 else if(cc[a]=='g')
//                 {
//                     line();midg();gap();
//                 }
//                 else if(cc[a]=='h')
//                 {
//                     line();midh();line();gap();
//                 }
//                 else if(cc[a]=='i')
//                 {
//                     spi();gap();
//                 }
//                 else if(cc[a]=='j')
//                 {
//                     spj();gap();
//                 }
//                 else if(cc[a]=='k')
//                 {
//                     line();midk();gap();
//                 }
//                 else if(cc[a]=='l')
//                 {
//                     line();midl();gap();
//                 }
//                 else if(cc[a]=='m')
//                 {
//                     line();crossbr();line(); midv();line();crossbl();line(); gap();
//                 }
//                 else if(cc[a]=='n')
//                 {
//                     line();crossbr();line();crosstl();line(); /*mid();*/ gap();
//                 }
//                 else if(cc[a]=='o')
//                 {
//                     mido();gap();
//                 }
//                 else if(cc[a]=='p')
//                 {
//                     line();midp();gap();
//                 }
//                 else if(cc[a]=='q')
//                 {
//                     spq();gap();
//                 }
//                 else if(cc[a]=='r')
//                 {
//                     line();midr();gap();
//                 }
//                 else if(cc[a]=='s')
//                 {
//                     sps();gap();
//                 }
//                 else if(cc[a]=='t')
//                 {
//                     spt();gap();
//                 }
//                 else if(cc[a]=='u')
//                 {
//                     line();midu();line();gap();
//                 }
//                 else if(cc[a]=='v')
//                 {
//                     crossbr();line();midv();line();crossbl();gap();
//                 }
//                 else if(cc[a]=='w')
//                 {
//                     line();crosstr();line();midw();line();crosstl();line();gap();
//                 }
//                 else if(cc[a]=='x')
//                 {
//                     spx();gap();
//                 }
//                 else if(cc[a]=='y')
//                 {
//                     spy();gap();
//                 }
//                 else if(cc[a]=='z')
//                 {
//                     spz();gap();
//                 }
//                 else if(cc[a]==' ')
//                 {
//                     gap();gap();
//                 }

//             }

//             System.out.print("\n");
            
//         }
//         System.out.println("\n\n---------------------------------------------------------------- Name Print Successfully -----------------------------------\n");

//     }

//     //--------------------------------------------------------- Function Definition ------------------------------------------------------

//     public static void line()    //create a line
//     {
//        for(k=0;k<=2;k++)
//        {
//            System.out.printf("*");
//        } 
//     }
    
//     public static void gap()    //create space
//     {
//        for(k=0;k<=2;k++)
//        {
//            System.out.printf(" ");
//        } 
//     }

//     public static void crosstr()    //cross triangle top(right)
//     {
//        for(j=10;j>=i;j--)
//        {
//            System.out.printf(" ");
//        } 
//     }

//     public static void crosstl()    //same top triangle (left)
//     {
//        for(j=10;j>=i;j--)
//        {
//            System.out.printf(" ");
//        } 
//     }

//     public static void crossbr()    //cross triangle bottom(right)
//     {
//        for(l=1;l<=i;l++)
//        {
//            System.out.printf(" ");
//        } 
//     }

//     public static void crossbl()    //same bottom triangle (left)
//     {
//        for(j=1;j<=i;j++)
//        {
//            System.out.printf(" ");
//        } 
//     }

//     public static void mida()    //middle part of A
//     {
//        for(l=1;l<=i;l++)
//        {
//            if(i>4 && i<7)
//            {
//               System.out.printf("**");
//            }
//            else
//            {
//                System.out.printf(" ");
//            }
//        } 
//     }

//     public static void midb()    //create B
//     {
//        for(l=1;l<=5;l++)                                // middle body of B
//        {
//            if(i>=0 && i<2 || i>4 && i<7 || i>9 && i<=11)
//            {
//               System.out.printf("**");
//            }
//            else
//            {
//                System.out.printf("  ");   // two space
//            }
//        } 
//        for(k=0;k<=2;k++)                                // middle body of B
//        {
//            if(i>=0 && i<2 || i>4 && i<7 || i>9 && i<=11)
//            {
//               System.out.printf(" ");   // one space
//            }
//            else
//            {
//                System.out.printf("*");   
//            }
//        } 
//     }

//     public static void midc()    //create C
//     {
//        for(l=1;l<=5;l++)                                // middle body of C
//        {
//            if(i>=0 && i<2 || i>9 && i<=11)
//            {
//               System.out.printf("**");
//            }
//            else
//            {
//                System.out.printf("  ");   // two space
//            }
//        } 
      
//     }

//     public static void midh()    //create H
//     {
//        for(l=1;l<=5;l++)                                // middle body of B
//        {
//            if(i>4 && i<7 )
//            {
//               System.out.printf("**");
//            }
//            else
//            {
//                System.out.printf("  ");   // two space
//            }
//        } 
//     //    for(k=0;k<=2;k++)                                // middle body of H
//     //    {
//     //        if(i>0 && i<2 || i>4 && i<7 || i>9 && i<=11)
//     //        {
//     //           System.out.printf(" ");   // one space
//     //        }
//     //        else
//     //        {
//     //            System.out.printf("*");   
//     //        }
//     //    } 
//     }

//     public static void mide()    //create E
//     {
//        for(l=1;l<=5;l++)                                // middle body of E
//        {
//            if(i>=0 && i<2 || i>4 && i<7 || i>9 && i<=11)
//            {
//               System.out.printf("**");
//            }
//            else
//            {
//                System.out.printf("  ");   // two space
//            }
//        } 
//     //    for(k=0;k<=2;k++)                                // middle body of E
//     //    {
//     //        if(i>0 && i<2 || i>4 && i<7 || i>9 && i<=11)
//     //        {
//     //           System.out.printf(" ");   // one space
//     //        }
//     //        else
//     //        {
//     //            System.out.printf("*");   
//     //        }
//     //    } 
//     }

//     public static void midd()    //create D
//     {
//        for(l=1;l<=5;l++)                                // middle body of D
//        {
//            if(i>=0 && i<2 || i>9 && i<=11 || l==5)
//            {
//               System.out.printf("**");
//            }
//            else
//            {
//                System.out.printf("  ");   // two space
//            }
//        } 
//        for(k=0;k<2;k++)                                // middle body of D
//        {
//            if(i>=0 && i<2 || i>9 && i<=11)
//            {
//               System.out.printf(" ");   // one space
//            }
//            else
//            {
//                System.out.printf("*");   
//            }
//        } 
//     }

//     public static void midf()    //create F
//     {
//        for(l=1;l<=5;l++)                                // middle body of F
//        {
//            if(i>=0 && i<2 || i>4 && i<7 )
//            {
//               System.out.printf("**");
//            }
//            else
//            {
//                System.out.printf("  ");   // two space
//            }
//        } 
//     //    for(k=0;k<=2;k++)                                // middle body of F
//     //    {
//     //        if(i>0 && i<2 || i>4 && i<7 || i>9 && i<=11)
//     //        {
//     //           System.out.printf(" ");   // one space
//     //        }
//     //        else
//     //        {
//     //            System.out.printf("*");   
//     //        }
//     //    } 
//     }

//     public static void midg()    //create B
//     {
//        for(l=1;l<=5;l++)                                // middle body of G
//        {
//            if(i>=0 && i<2 || i>4 && i<7 && l>=3 && l<=5 || i>=6 && i<=9 && l==5 || i>9 && i<=11)
//            {
//               System.out.printf("**");
//            }
//            else
//            {
//                System.out.printf("  ");   // two space
//            }
//        } 
//     //    for(k=0;k<=2;k++)                                // middle body of G 
//     //    {
//     //        if(i>0 && i<2 || i>4 && i<7 || i>9 && i<=11)
//     //        {
//     //           System.out.printf(" ");   // one space
//     //        }
//     //        else
//     //        {
//     //            System.out.printf("*");   
//     //        }
//     //    } 
//     }

//     public static void spi()    //create I
//     {
//        for(l=0;l<=6;l++)                                // middle body of B
//        {
//            if(i>=0 && i<2 || i>=2 && i<=9 && l==3 || i>9 && i<=11)
//            {
//               System.out.printf("**");
//            }
//            else
//            {
//                System.out.printf("  ");   // two space
//            }
//        } 
//     //    for(k=0;k<=2;k++)                                // middle body of I
//     //    {
//     //        if(i>0 && i<2 || i>4 && i<7 || i>9 && i<=11)
//     //        {
//     //           System.out.printf(" ");   // one space
//     //        }
//     //        else
//     //        {
//     //            System.out.printf("*");   
//     //        }
//     //    } 
//     }

//     public static void spj()    //create J
//     {
//        for(l=0;l<=6;l++)                                // middle body of J
//        {
//            if(i>=0 && i<2 || i>=2 && i<=9 && l==3 || i>=7 && i<=9 && l==0 || i>9 && i<=11 && l<=3)
//            {
//               System.out.printf("**");
//            }
//            else
//            {
//                System.out.printf("  ");   // two space
//            }
//        } 
//     //    for(k=0;k<=2;k++)                                // middle body of J
//     //    {
//     //        if(i>0 && i<2 || i>4 && i<7 || i>9 && i<=11)
//     //        {
//     //           System.out.printf(" ");   // one space
//     //        }
//     //        else
//     //        {
//     //            System.out.printf("*");   
//     //        }
//     //    } 
//     }

//     public static void midk()    //create K
//     {
//        for(l=0;l<=6;l++)                                // middle body of K
//        {
//            if(l==count)
//            {
//               System.out.printf("***");
//            }
//            else
//            {
//                System.out.printf("  ");   // two space
//            }
//        } 
//        if(i<=5)
//        {
//            count--;
//        }
//        else if(i<=11)
//        {
//            count++;
//        }

//     //    for(k=0;k<=2;k++)                                // middle body of K
//     //    {
//     //        if(i>0 && i<2 || i>4 && i<7 || i>9 && i<=11)
//     //        {
//     //           System.out.printf(" ");   // one space
//     //        }
//     //        else
//     //        {
//     //            System.out.printf("*");   
//     //        }
//     //    } 
//     }

//     public static void midl()    //create L
//     {
//        for(l=1;l<=5;l++)                                // middle body of L
//        {
//            if(i>9 && i<=11)
//            {
//               System.out.printf("**");
//            }
//            else
//            {
//                System.out.printf("  ");   // two space
//            }
//        } 
//     //    for(k=0;k<=2;k++)                                // middle body of L
//     //    {
//     //        if(i>0 && i<2 || i>4 && i<7 || i>9 && i<=11)
//     //        {
//     //           System.out.printf(" ");   // one space
//     //        }
//     //        else
//     //        {
//     //            System.out.printf("*");   
//     //        }
//     //    } 
//     }

//     public static void midv()    //create v
//     {
//        for(j=10;j>=i;j--)                                // middle body of V
//        {
//            if(i>0 && i<2 || i>4 && i<7 || i>9 && i<=11)
//            {
//               System.out.printf("**");
//            }
//            else
//            {
//                System.out.printf("  ");   // two space
//            }
//        } 
//     //    for(k=0;k<=2;k++)                                // middle body of V
//     //    {
//     //        if(i>0 && i<2 || i>4 && i<7 || i>9 && i<=11)
//     //        {
//     //           System.out.printf(" ");   // one space
//     //        }
//     //        else
//     //        {
//     //            System.out.printf("*");   
//     //        }
//     //    } 
//     }

//     public static void mido()    //create O
//     {
//        for(k=0;k<=2;k++)                                // middle body of O
//        {
//            if(i==0 && k<2 || i==1 && k<1 || i==11 && k<2 || i==10 && k<1)
//            {
//               System.out.printf(" ");   //one space
//            }
//            else
//            {
//                System.out.printf("*");   
//            }
//        } 
//        for(l=1;l<=6;l++)                                // middle body of O
//        {
//            if(i>=0 && i<2 || i>9 && i<=11)
//            {
//               System.out.printf("**");   
//            }
//            else
//            {
//                System.out.printf("  ");   //two space
//            }
//        } 
//        for(k=0;k<=2;k++)
//        {
//            if(i==0 && k>0 || i==1 && k>1 || i==11 && k>0 || i==10 && k>1)
//            {
//                System.out.printf(" ");
//            }
//            else 
//            {
//                System.out.printf("*");
//            }
//        }
//     }

//     public static void midp()    //create P
//     {
//        for(l=1;l<=5;l++)                                // middle body of P
//        {
//            if(i>=0 && i<2 || i>4 && i<7 || i>=2 && i<=4 && l==5)
//            {
//               System.out.printf("**");
//            }
//            else
//            {
//                System.out.printf("  ");   // two space
//            }
//        } 
//     //    for(k=0;k<=2;k++)                                // middle body of P
//     //    {
//     //        if(i>0 && i<2 || i>4 && i<7 || i>9 && i<=11)
//     //        {
//     //           System.out.printf(" ");   // one space
//     //        }
//     //        else
//     //        {
//     //            System.out.printf("*");   
//     //        }
//     //    } 
//     }

//     public static void spq()    //create Q
//     {
//        for(l=0;l<=11;l++)                                // middle body of Q
//        {
//            if(i>=0 && i<2 && l<9 || i>=2 && i<9 && l==0 || l==8 && i<10 || i>7 && i<=9 && l<9 || i>=9 && i<=11 && l==i)
//            {
//               System.out.printf("**");
//            }
//            else
//            {
//                System.out.printf("  ");   // two space
//            }
//        } 
//     //    for(k=0;k<=2;k++)                                // middle body of Q
//     //    {
//     //        if(i>0 && i<2 || i>4 && i<7 || i>9 && i<=11)
//     //        {
//     //           System.out.printf(" ");   // one space
//     //        }
//     //        else
//     //        {
//     //            System.out.printf("*");   
//     //        }
//     //    } 
//     }

//     public static void midr()    //create R
//     {
//        for(l=1;l<=5;l++)                                // middle body of R
//        {
//            if(i>=0 && i<2 || i>4 && i<7 || i>=2 && i<=4 && l==5 || i>=7 && i<=11 && l==c4)
//            {
//               System.out.printf("**");
//            }
//            else
//            {
//                System.out.printf("  ");   // two space
//            }
//        } 
//        if(i>6)
//        {
//            c4++;
//        }
//        else if(c4>5)
//        {
//            c4=1;
//        }
//     //    for(k=0;k<=2;k++)                                // middle body of R
//     //    {
//     //        if(i>0 && i<2 || i>4 && i<7 || i>9 && i<=11)
//     //        {
//     //           System.out.printf(" ");   // one space
//     //        }
//     //        else
//     //        {
//     //            System.out.printf("*");   
//     //        }
//     //    } 
//     }

//     public static void sps()    //create S
//     {
//        for(l=1;l<=8;l++)                                // middle body of S
//        {
//            if(i>=0 && i<2 || i>4 && i<7 || i>=2 && i<=4 && l==1 || i>6 && i<=9 && l==8 || i>9 && i<=11)
//            {
//               System.out.printf("**");
//            }
//            else
//            {
//                System.out.printf("  ");   // two space
//            }
//        } 
//     //    for(k=0;k<=2;k++)                                // middle body of S
//     //    {
//     //        if(i>0 && i<2 || i>4 && i<7 || i>9 && i<=11)
//     //        {
//     //           System.out.printf(" ");   // one space
//     //        }
//     //        else
//     //        {
//     //            System.out.printf("*");   
//     //        }
//     //    } 
//     }

//     public static void spt()    //create T
//     {
//        for(l=0;l<=6;l++)                                // middle body of T
//        {
//            if(i>=0 && i<2 || i>=2 && i<=11 && l==3 )
//            {
//               System.out.printf("**");
//            }
//            else
//            {
//                System.out.printf("  ");   // two space
//            }
//        } 
//     //    for(k=0;k<=2;k++)                                // middle body of T
//     //    {
//     //        if(i>0 && i<2 || i>4 && i<7 || i>9 && i<=11)
//     //        {
//     //           System.out.printf(" ");   // one space
//     //        }
//     //        else
//     //        {
//     //            System.out.printf("*");   
//     //        }
//     //    } 
//     }

//     public static void midu()    //create U
//     {
//        for(l=1;l<=6;l++)                                // middle body of U
//        {
//            if(i>9 && i<=11)
//            {
//               System.out.printf("**");
//            }
//            else
//            {
//                System.out.printf("  ");   // two space
//            }
//        } 
//     //    for(k=0;k<=2;k++)                                // middle body of U
//     //    {
//     //        if(i>0 && i<2 || i>4 && i<7 || i>9 && i<=11)
//     //        {
//     //           System.out.printf(" ");   // one space
//     //        }
//     //        else
//     //        {
//     //            System.out.printf("*");   
//     //        }
//     //    } 
//     }

//     public static void midw()    //create W
//     {
//         for(j=1;j<=i;j++)
//         {
//             System.out.printf("  ");
//         }
//     //    for(l=1;l<=5;l++)                                // middle body of W
//     //    {
//     //        if(i>0 && i<2 || i>4 && i<7 || i>9 && i<=11)
//     //        {
//     //           System.out.printf("**");
//     //        }
//     //        else
//     //        {
//     //            System.out.printf("  ");   // two space
//     //        }
//     //    } 
//     //    for(k=0;k<=2;k++)                                // middle body of W
//     //    {
//     //        if(i>0 && i<2 || i>4 && i<7 || i>9 && i<=11)
//     //        {
//     //           System.out.printf(" ");   // one space
//     //        }
//     //        else
//     //        {
//     //            System.out.printf("*");   
//     //        }
//     //    } 
//     }

//     public static void spx()    //create X
//     {
//        for(l=0;l<=11;l++)                                // middle body of X
//        {
//            if(l==c || l==c1)
//            {
//               System.out.printf("***");
//            }
//            else
//            {
//                System.out.printf("  ");   // two space
//            }
//        } 
//        if(i<=4)
//        {
//            c++;
//            c1--;
//        }
//        else if(i<=11)
//        {
//            c1++;
//            c--;
//        }

//     //    for(k=0;k<=2;k++)                                // middle body of X
//     //    {
//     //        if(i>0 && i<2 || i>4 && i<7 || i>9 && i<=11)
//     //        {
//     //           System.out.printf(" ");   // one space
//     //        }
//     //        else
//     //        {
//     //            System.out.printf("*");   
//     //        }
//     //    } 
//     }

//     public static void spy()    //create Y
//     {
//        for(l=0;l<=11;l++)                                // middle body of Y
//        {
//            if(l==c2 || l==c3 && i<5)
//            {
//               System.out.printf("***");
//            }
//            else
//            {
//                System.out.printf("  ");   // two space
//            }
//        } 
//        if(i<=4)
//        {
//            c2++;
//            c3--;
//        }
//        else if(i<=11)
//        {
//            c3++;
//        }
//        if(i>=5)
//        {
//            System.out.printf(" ");
//        }

//     //    for(k=0;k<=2;k++)                                // middle body of Y
//     //    {
//     //        if(i>0 && i<2 || i>4 && i<7 || i>9 && i<=11)
//     //        {
//     //           System.out.printf(" ");   // one space
//     //        }
//     //        else
//     //        {
//     //            System.out.printf("*");   
//     //        }
//     //    } 
//     }

//     public static void spz()    //create Z
//     {
//        for(l=0;l<=11;l++)                                // middle body of Z
//        {
//            if(i>=0 && i<2 || i>9 && i<=11 || i>=2 && i<=9 && l==c4)
//            {
//               System.out.printf("**");
//            }
//            else
//            {
//                System.out.printf("  ");   // two space
//            }
//        } 
//        c4=c4-1;

//     //    for(k=0;k<=2;k++)                                // middle body of Z
//     //    {
//     //        if(i>0 && i<2 || i>4 && i<7 || i>9 && i<=11)
//     //        {
//     //           System.out.printf(" ");   // one space
//     //        }
//     //        else
//     //        {
//     //            System.out.printf("*");   
//     //        }
//     //    } 
//     }


// }
