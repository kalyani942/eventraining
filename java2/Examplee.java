package package1;
public class Hello
{
public void sayHello()
{
System.out.println("import from package1");
}
}
package Package2;
import package1.Hello;
public class Exampleee
{
public static void main(String[]args)
{
Hello hello=new Hello();
hello.sayHello();
}
}