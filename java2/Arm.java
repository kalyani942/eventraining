import java.util.*;
import java.util.Scanner;
public class Arm
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
int n;
System.out.println("Enter a number :");
n=sc.nextInt();
int digit=0;
int temp=n;
int sum=0;
temp=n;
while(temp!=0)
{
temp=temp/10;
digit++;
}
System.out.println("digit="+digit);
temp=n;
while(temp!=0)
{
int r=temp%10;
sum=sum+(int)Math.pow(r,digit);
temp=temp/10;
}
if(sum== n)
{
System.out.println("The no. is armstrong");
}
}
}
