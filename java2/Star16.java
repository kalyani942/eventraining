import java.util.*;
import java.util.Scanner;
public class Star16
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a number :");
int n=sc.nextInt();
for(int i=1; i<=n;i++)
{
for(int j=1; j<=n; j++)
{
if(j==1 || i==1 || j==n || i==n)
{
System.out.print("*");
}
else
{
System.out.print(" ");
}
}
System.out.println();
}
}
}