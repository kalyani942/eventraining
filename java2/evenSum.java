import java.util.*;
import java.util.Scanner;
public class evenSum
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
int i;
int sum=0;
int n=10;
for(i=0;i<=10;i++)
{
if(i%2==0)
sum=sum+i;
}
System.out.println("The sum of even number is :"+sum);
}
}