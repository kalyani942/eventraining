public class Employee{
private String name;
private int id;
public void setEmp(){
name="kalyani";
id=100;
}
public void getEmp(){
System.out.println(name);
System.out.println(id);
}}
public class Employee1{
public static void main(String[] args){
Employee e1=new Employee();
e1.setEmp();
e1.getEmp();
}
}
