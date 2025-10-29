import java.util.*;
import java.util.Scanner;
public class Harshad
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
int n;
int rem;
int temp;
int sum=0;
System.out.println("enter a number :");
n=sc.nextInt();
temp=n;
while(temp>0)
{
rem=temp%10;
temp=temp/10;
sum=sum+rem;
}
if(n%sum==0)
{
System.out.println("Harshad number");
}
else
{
System.out.println("not a Harshad number");
}
}
}