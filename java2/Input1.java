import java.io.*;
class Input1{
public static void main(String[]args) throws Exception{
InputStreamReader is=new InputStreamReader(System.in);{
BufferedReader br=new BufferedReader(is);
String name;
System.out.println("Enter ur name:");
name=br.readLine();
System.out.println("you have entered:"+name);
}
}
}