import java.util.*;
import java.util.Scanner;
public class Neon1
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number :");
int n=sc.nextInt();
for(int i=1; i<1000; i++)
{
int m=i*i;
int sum=0;
while(m!=0)
{
int r=m%10;
sum=sum+r;
m=m/10;
}
if(sum==i)
System.out.println(""+i+" is a neon number");
}
}
}