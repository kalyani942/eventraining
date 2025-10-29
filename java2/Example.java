import java.util.*;
public class Example{
public static void main(String[]args){
int year;
Scanner sc=new Scanner(System.in);
System.out.println("Enter your year :");
year=sc.nextInt();
if(((year%4==0)&&(year%100!=0))||(year%400==0))
{
System.out.println("It is the leap year");
}
else{
System.out.println("Common year");
}
}
}