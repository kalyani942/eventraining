import java.util.*;
import java.util.Scanner;
public class Count1
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int count=0;
int n;
System.out.println("Enter four digit :")
n=sc.nextInt();
while(n>0)
{
count=count+1;
n=n/10;
System.out.println("the number of digit are :"+count);
}
}
}