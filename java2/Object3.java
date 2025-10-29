import java.lang.*;
public class Object3
{
String name;
int id;
Object3(String n, int i)
{
name=n;
id=i;
}
public static void main(String[]args)
{
Object3 ob1=new Object3();
System.out.println(ob1.name);
System.out.println(ob1.id);
}
}