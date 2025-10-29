public class Object
{
int m1()
{
int a=100;
return a;
}
float m2()
{
float b=17.0f;
return b;
}
Object m3()
{
return this;
}
public static void main(String[]args)
{
Object t1=new Object();
System.out.println(t1.m1());
System.out.println(t1.m2());
System.out.println(t1.m3());
System.out.println(t1.m3());
System.out.println(t1.m3());
}
}