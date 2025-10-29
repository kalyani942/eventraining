public class Static1
{
String name;
static String clgName="NIT";
Static1(String n)
{
name=n;
}
void display()
{
System.out.println(name);
System.out.println(clgName);
}
public static void main(String[] args)
{
Static1 s1=new Static1("Kalyani");
Static1.clgName="NIIT";
s1.display();
}
}

