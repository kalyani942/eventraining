import java.util.*;
public class Grade{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the mark :");
int mark=sc.nextInt();
if(mark>=90)
{
System.out.println("Grade top");
}
else if(mark>=80)
{
System.out.println("Grade O");
}
else if(mark>=70)
{
System.out.println("Grade E");
}
else if(mark>=60)
{
System.out.println("Grade A");
}
else{
System.out.println("Fail");
}
}
}