import java.util.*;
import java.util.Scanner;
public class Digit1
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n=101;
int i;
int sum=0;
int rem;
System.out.println("Enter a number :");
n=sc.nextInt();
while(n>0)
{
rem=n%10;
sum=sum+rem;
n=n/10;
}
System.out.println("The sum of digits is :"+sum);
}
}