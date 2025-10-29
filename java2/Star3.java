import java.util.*;
import java.util.Scanner;
public class Star3
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a number :");
int n=sc.nextInt();
for(int i=1; i<=n;i++)
{
for(int j=4;j>=i;j--)
{
System.out.print(" ");
}
for(int k=1; k<=i;k++)
{
System.out.print("*");
}
System.out.println("");
}
}
}