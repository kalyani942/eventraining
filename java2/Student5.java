public class Student5
{
String name;
int id;
int salary;
Student5(String n ,int i,int s)
{
name=n;
id=i;
salary=s;
}
public static void main(String[]args)
{
Student5 s1=new Student5("Kalyani",100,1000);
System.out.println(s1.name+" "+s1.id+" "+s1.salary);
}
}