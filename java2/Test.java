public class Test{
int a;
int b;
int c;
int Add(int d, int e){
a=d;
b=e;
c=a+b;
return c;
}
public static void main(String[] args){
Test t1=new Test();
t1.Add(10,23);
System.out.println(t1.Add(10,23));
}
}