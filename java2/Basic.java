import java.util.*;
public class Basic{
public static void main(String[]args){
int a;
int b;
int c;
int choice;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of a :");
a=sc.nextInt();
System.out.println("Enter the value of b :");
b=sc.nextInt();
System.out.println("Choose the operations:");
System.out.println("1.Addition :");
System.out.println("2.Substraction :");
System.out.println("3.multiplication :");
System.out.println("4.division :");
choice=sc.nextInt();
switch(choice)
{
case 1 :
c=a+b;
System.out.println("the addition is="+c);
break;
case 2:
c=a-b;
System.out.println("The substraction is ="+c);
break;
case 3:
c=a*b;
System.out.println("The multiplication is ="+c);
break;
case 4:
c=a/b;
System.out.println("The division is="+c);
break;
default:
System.out.println("Invalid choice");
}
}
}