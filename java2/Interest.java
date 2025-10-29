import java.util.*;
import java.util.Scanner;
public class Interest
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int p;
int t;
int r;
System.out.println("Enter the principal value :");
p=sc.nextInt();
System.out.println("Enter the time :");
t=sc.nextInt();
System.out.println("Enter the rate :");
r=sc.nextInt();
int SI=p*t*r/100;
System.out.println("The simple interest is :"+SI);
}
}
