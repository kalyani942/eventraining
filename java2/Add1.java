import java.io.*;
class Add1{
public static void main(String[]args)throws Exception
{
InputStreamReader is=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(is);
System.out.println("Enter the value of a:");
int a=Integer.parseInt(br.readLine());
System.out.println("Enter the value of b:");
int b=Integer.parseInt(br.readLine());
int add=a+b;
System.out.println("sum="+add);
}
}