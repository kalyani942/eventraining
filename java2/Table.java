import java.util.*;
public class Table{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number to print its multiplication table :");
int num=sc.nextInt();
System.out.println("the multiplication table of "+num+" is :");
for(int i=1;i<=10;i++)
{
System.out.println(num+"X"+i+"="+num*i);
}
}
}