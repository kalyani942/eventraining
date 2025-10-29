import java.util.*;
import java.util.Scanner;
public class Disarium
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a number :");
int n=sc.nextInt();
int digit=0;
int sum=0;
int temp=n;
while(temp!=0)
{
temp=temp/10;
digit++;
}
temp=n;
while(temp!=0)
{
int r=temp%10;
sum=sum+(int)Math.pow(r,digit--);
temp=temp/10;
}
if(sum==n)
{
System.out.println(""+n+" is the disarium no.");
}
else
{
System.out.println(""+n+" is not disarium no.");
}
}
}