import java.util.*;
public class Scanner1{
public static void main(String[] args)
{
Scanner1 sc=new Scanner1(System.in);
String name;
int roll;
System.out.println("Enter the name:");
name=sc.nextLine();
System.out.println("Enter the roll:");
roll=sc.nextInt();
System.out.println("you have entered the name:"+name);
System.out.println("you have entered the roll:"+roll);
}
}