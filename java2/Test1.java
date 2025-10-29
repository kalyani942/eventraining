public class Test1
{
String name;
int roll;
void Input(String n, int id)
{
name=n;
roll=id;
}
public static void main(String[] args)
{
Test1 t2=new Test1();
t2.Input("Kalyani",10);
System.out.println(t2.name);
System.out.println(t2.roll);
}
}