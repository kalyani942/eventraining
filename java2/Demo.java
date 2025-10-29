import java.util.Scanner;
public class Demo
{
public static void main(String[] args)
{
int arr[]=new int[10];
Scanner sc=new Scanner(System.in);
int i;
System.out.println("Enter a number:");
for(i=0;i<10;i++)
{
i=sc.nextInt();
}
for(i=0;i<10;i++)
{
System.out.println("the array elements are="+arr[i]);
}
}
}