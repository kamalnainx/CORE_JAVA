
package chapter02;


class ShiftOp
{
public static void main(String args[])
{
int a = -2;
int b = a >> 2;
int c = a << 2;
int d = a >>>24 ;
System.out.println("Right shift of -2 by 2 bits is: " + b);
System.out.println("Left shift of -2 by 2 bits is: " + c);
System.out.println("Unsigned shift of -2 by 24 bits is: " +
d);
}
}