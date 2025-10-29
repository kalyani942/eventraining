import java.util.*;
import java.util.Scanner;
public class Auto
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number :");
int n=sc.nextInt();
for(int i=1; i<1000;i++)
{
int digit=0;
int sqr=i*i;
int m=i;
while(m!=0)
{
m=m/10;
digit++;
}
int temp=(int)Math.pow(10,digit);
int result=sqr%temp;
if(i==result)
System.out.println("Automorphic no.="+i);
}
}
}