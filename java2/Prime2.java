import java.util.*;
import java.util.Scanner;
public class Prime2
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a number :");
int n=sc.nextInt();
if(n<=1)
System.out.println("number is not prime");
else
System.out.println("number is prime");
}
}