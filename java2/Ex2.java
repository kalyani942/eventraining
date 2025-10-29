class MultiplyFun
{
MultiplyFun()
{
int a;
int b;
}
static int Show(int a, int b)
{
return a*b;
}
static double Show(double a, double b)
{
return a+b;
}
}
public class Shop
{
public static void main(String[]args)
{
System.out.println(MultiplyFun.Show(3,4));
System.out.println(MultiplyFun.Show(5.5 , 5.5));
}
}