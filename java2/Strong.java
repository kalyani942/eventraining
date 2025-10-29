import java.util.*;
import java.util.Scanner;
public class Strong
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of n :");
n=sc.nextInt();
for()
{
int n;
int fact;
int rem;
int sum=0;
int i;
int temp=n;
while(temp>0)
{
rem=temp%10;
fact=1;
for(i=1;i<=rem;i++)
{
fact=fact*i;
}
sum=sum+fact;
temp=temp/10;
}
if(sum==n)
System.out.println("Strong no.");
}
}
}
