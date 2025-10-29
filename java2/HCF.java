import java.util.*;
import java.util.Scanner;
public class HCF
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int min;
int i;
System.out.println("Enter a number :");
int a=sc.nextInt();
System.out.println("Enter another number :");
int b=sc.nextInt();
if(a<b)
{
min=a;
}
else
{
min=b;
}
for(i=min; i>1; i--)
{
if(a%i==0 && b%i==0)
{
System.out.println("The HCF value is :"+i);
}
}
}
}