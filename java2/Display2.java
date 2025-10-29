import java.util.Scanner;
public class Display2
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the first number :");
int num1=sc.nextInt();
System.out.println("Enter the second number :");
int num2=sc.nextInt();
for(int i=1;i<1000;i++)
{
int m;
int sum=0;
int digit=0;
m=i;
while(m!=0)
{
m=m/10;
digit++;
}
m=i;
while(m!=0)
{
int rem=m%10;
sum=sum+(int)Math.pow(rem,digit);
m=m/10;
}
if(sum==i)
{
System.out.println(""+i+" is an Armstrong number.");
}
}
}
}