import java.util.*;
import java.util.Scanner;
public class Automorphic
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
int n;
int sq;
int end;
int l=0;
int t=0;
System.out.println("Enter a number you want :");
n=sc.nextInt();
t=n;
while(t>0)
{
int rem=t%10;
t++;
t=t/10;
}
sq=n*n;
end=sq % (int)Math.pow(10,l);
if(n==end)
{
System.out.println("the no. is automorphic");
}
else
{
System.out.println("the no. not is automorphic");
}
}
}