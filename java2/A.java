import java.util.*;
import java.util.Scanner;
public class Perfect
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
int n;
int i;
int sum=0;
System.out.println("Enter any number:");
n=sc.nextInt();
for(i=1;i<n;i++)
{
if(n%i==0)
{
sum=sum+i;
System.out.println("the perfect no. is :"+sum);
}
}
}
}