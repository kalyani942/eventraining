public class Encapsulation
{
private String name;
int roll;
public void setMethod(String n, int r)
{
name=n;
roll=r;
}
public void getMethod()
{
System.out.println(name+" "+roll);
}
}
public class Encapsulation2
{
public static void main(String[] args)
{
Encapsulation e1=new Encapsulation();
e1.setMethod("kalyani",10);
e1.getMethod();
}
}
