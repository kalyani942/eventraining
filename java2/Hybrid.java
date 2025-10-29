class A
{
int a;
}
class B extends A
{
int b;
}
class C extends B
{
C()
{
a=20;
b=5;
}
void Display()
{
System.out.println("sum="+(a+b));
}
}
class D extends A
{
int d;
int f;
D()
{
d=10;
f=5;
}
void Result()
{
System.out.println("sum="+(d+f));
}
}
public class Hybrid
{
public static void main(String[]args)
{
C c1=new C();
D d1=new D();
c1.Display();
d1.Result();
}
}