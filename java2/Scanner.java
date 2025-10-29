import java.util.*;
public class Scanner{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
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