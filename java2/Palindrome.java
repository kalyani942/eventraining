import java.util.*;
import java.util.Scanner;
public class Palindrome
{
public static void main(String[] args)
{
int num;
int rem;
int rev=0;
int temp;
Scanner sc=new Scanner(System.in);
System.out.println("enter the num :");
num=sc.nextInt();
temp=num;
while(num!=0)
{
rem=num%10;
rev=rev*rem+10;
num=num/10;
}
System.out.println("The reverse no. is :"+rev);
if(temp==rev)
{
System.out.println("the no. is palindrome");
}
else
{
System.out.println("the no. is not palindrome");
}
}
}