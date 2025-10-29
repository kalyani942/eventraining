public class Student4
{
String name;
int roll;
void Insert(String n, int i)
{
name=n;
roll=i;
}
void Display()
{
System.out.println(name+" "+roll);
}
public static void main(String[]args)
{
Student4 s1=new Student4();
Student4 s2=new Student4();
s1.Insert("kalyani",10);
s2.Insert("Rani",100);
s1.Display();
s2.Display();
}
}