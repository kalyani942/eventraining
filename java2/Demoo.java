class TestSyn1
{
static synchronized void printResult()
{
System.out.println("kalyani");
System.out.println("mandal");
}
}
class Thread1 extends Thread
{
TestSyn1 t1;
Thread1(TestSyn1 ob)
{
t1=ob;
}
public void run()
{
t1.printResult();
}
}
class Thread2 extends Thread
{
TestSyn1 t2;
Thread2(TestSyn1 ob)
{
t2=ob;
}
public void run()
{
t2.printResult();
}
}
public class Demoo
{
public static void main(String[]args)
{
TestSyn1 ob=new TestSyn1();
TestSyn1 ob3=new TestSyn1();
Thread1 ob1=new Thread1(ob);
Thread2 ob2=new Thread2(ob3);
ob1.start();
ob2.start();
}
}

