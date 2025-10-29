import java.util.*;
import java.util.Scanner;
public class Prime3
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
int n;
int i;
int j;
int flag=0;
int sum=0;
System.out.println("Enter a number :");
n=sc.nextInt();
for(i=1;i<n;i++)
{
flag=0;
for(j=2;j<i;j++)
{
if(i%j==0)
{
flag=1;
break;
}
}
if(flag==0)
{
System.out.println(i);
sum=sum+i;
}
}
System.out.println("sum:"+sum);
}
}


