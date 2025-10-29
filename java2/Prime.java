import java.util.*;
public class Prime{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number :");
int num=sc.nextInt();
if(num<=1){
System.out.println("The number is prime");
}
else{
System.out.println("The no. is not prime");
}
}
}