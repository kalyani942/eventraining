import java.util.*;
import java.util.Scanner;
public class Prime1
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
int rem;
int sum=0;
int num;
System.out.println("Enter a number :");
num=sc.nextInt();
while(num>0)
{
rem=num%10;
if(num<=1)
System.out.println("The number is not prime");
else
System.out.println("The number is prime");
sum=sum+rem;
num=num/10;
}
System.out.println("The prime number is :"+sum);
}
}