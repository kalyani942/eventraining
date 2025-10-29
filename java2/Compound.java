import java.util.*;
import java.util.Scanner;
public class Compound
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
double p;
double rate;
double time;
double n;
double A;
double CI;
System.out.println("Enter the principal amount :");
p=sc.nextDouble();
System.out.println("Enter the rate of interest  :");
rate=sc.nextDouble();
System.out.println("Enter the time in years :");
time=sc.nextDouble();
System.out.println("Enter number of times interest applied per year :");
n=sc.nextDouble();
A=p*Math.pow((1+rate/(100*n)),n*time);
CI=A-p;
System.out.println("The compound interest is :"+CI);
System.out.println("The final amount is :"+A);
}
}