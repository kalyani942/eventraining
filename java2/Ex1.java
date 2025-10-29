class Ex
{
static int Mark(int a, int b)
{
return a*b;
}
static double Mark(double a, double b)
{
return a+b;
}
}
public class Ex1
{
public static void main(String[]args)
{
System.out.println(Ex.Mark(3,4));
System.out.println(Ex.Mark(5.5 , 5.5));
}
}