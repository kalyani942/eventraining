public class Object1{
Object1(Object2 ob2)
{
System.out.println("I am in this constructor");
}
}
class Object2
{
void m2()
{
Object1 ob1=new Object1(this);
}
public static void main(String[]args)
{
Object2 ob2=new Object2();
ob2.m2();
}
}