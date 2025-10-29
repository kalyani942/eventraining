public class Fibonacci1
{
public static void main(String[] args)
{
int a=0;
int b=1;
int temp=0;
int n=10;
int sum=0;
System.out.println(a+" "+b);
while(true)
{
temp=a+b;
if(temp%2==0)
sum=sum+temp;
if(temp>n)
break;
a=b;
b=temp;
System.out.println("the series is:"+temp);
}
System.out.println("the sum is :"+sum);
}
}