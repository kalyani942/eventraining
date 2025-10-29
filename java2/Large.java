import java.util.*;
public class Large{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int a;
int b;
int c;
int large;
System.out.println("Enter the value of a :");
a=sc.nextInt();
System.out.prinln("Enter the value of b :");
b=sc.nextInt();
System.out.println("Enter the value of c :");
c=sc.nextInt();
if(a>b)
{
if(a>c)
System.out.println("a is larger :"+large);
else
System.out.println("c is larger :"+large);
}
else
{
if(b>c)
System.out.println("b is larger :"+large);
else
System.out.println("c is larger :"+large);
}
System.out.println("The largest no. is :"+large);
}
}