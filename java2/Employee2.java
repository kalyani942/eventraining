public class Employee{
private int id;
public void setEmp1(int f){
id=f;
}
public int getEmp1(){
return id;
}
}
public class Employee2{
public static void main(String[] args){
Employee e=new Employee();
e.setEmp1(100);
System.out.println(e.getEmp1());
}
}
