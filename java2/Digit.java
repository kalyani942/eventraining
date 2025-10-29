import java.util.*;
public class Digit{
public static void main(String[]args){
int i;
int sum=0;
int rem;
int n;
Scanner sc=new Scanner(System.in); 
System.out.println("Enter a number :");
n=sc.nextInt();
while(n>0)
{
rem=n%10;
sum=sum+rem;
n=n/10;
}
System.out.println("sum of digits="+sum);
}
}