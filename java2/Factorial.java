import java.util.*;
import java.util.Scanner;
public class Factorial
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int fact=1;
int n;
int i;
System.out.println("Enter a number :");
n=sc.nextInt();
for(i=1;i<=n;i++)
{
fact=fact*i;
}
System.out.println("the factorial of the number is :"+fact);
}
}