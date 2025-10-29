public class Fibonacci{
public static void main(String[] args){
int a=0;
int b=1;
int n=10;
int temp=0;
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
System.out.println("The series is:"+temp);
}
System.out.println("even no. sum is:"+sum);
}
}