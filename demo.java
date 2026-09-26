//max number and min number finding codeS
import java.util.Scanner;
class demo
{
public static void main(String args[])
{
int a,b,c;

System.out.println("Enter value of a : ");
Scanner s1 = new Scanner(System.in);
a= s1.nextInt();

System.out.println("Enter value of b : ");
b= s1.nextInt();

System.out.println("Enter value of c : ");
c= s1.nextInt();

if(b>a)
{
   if(c>b)
   {
    System.out.println("max number in this is ::"+c);
    System.out.println("min number in this is ::"+a);
    }
   if(b>c)
   {
      if(a>c)
      {
       System.out.println("max number in this is ::"+b);
       System.out.println("min number in this is ::"+c);
       }
      if(c>a)
      {
       System.out.println("max number in this is ::"+b);
       System.out.println("min nuber in this is ::"+a);
      }
   }
}
if(a>b)
{
   if(c>a)
   {
    System.out.println("max number in this is ::"+c);
    System.out.println("min number in this is ::"+b);
   }
   if(a>c)
   { 
     if(b>c)
     {
      System.out.println("max number in thils is ::"+a);
      System.out.println("min number in this is ::"+c);
     }
     if(c>b)
     {
      System.out.println("max number in thils is ::"+a);
      System.out.println("min number in thils is ::"+b);
      
     }
   }

}
}
}
   





