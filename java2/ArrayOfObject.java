public class ArrayOfObject
{
String name;
int roll;
public static void main(String[]args)
{
int i;
ArrayOfObject s1=new ArrayOfObject();
s1.name="Kalyani";
s1.roll=100;
ArrayOfObject s2=new ArrayOfObject();
s2.name="rani";
s2.roll=10;
ArrayOfObject stud[]=new ArrayOfObject[2];
stud[0]=s1;
stud[1]=s2;
for(i=0;i<stud.length;i++)
{
System.out.println(stud[i].name+" "+stud[i].roll);
}
}
}