import java.util.*;
import java.util.Scanner;
public class HarshadRange
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a number :");
int n=sc.nextInt();
for(int i=1; i<100; i++)
{
int m;
int rem;
int temp;
int sum=0;
temp=i;
while(temp>0)
{
rem=temp%10;
temp=temp/10;
sum=sum+rem;
}
if(i%sum==0)
System.out.println(""+i+" Harshad number");
}
}
}