class Employeee
{
private String name;
private int id;
void Set_Emp()
{
name="kalyani";
id=100;
}
void Get_Emp()
{
System.out.println("name="+name);
System.out.println("id="+id);
}
public static void main(String[]args)
{
Employeee e1=new Employeee();
e1.Set_Emp();
e1.Get_Emp();
}
}