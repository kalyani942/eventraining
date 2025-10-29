import java.util.*;
import java.util.Scanner;
public class Neon
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
int sum=0;
System.out.println("Enter a number :");
int n=sc.nextInt();
int square=n*n;
while(square>0)
{
sum=square%10;
square=square/10;
}
if(sum==n)
System.out.println("this is a neon number");
else
System.out.println("this is not a neon number");
}
}