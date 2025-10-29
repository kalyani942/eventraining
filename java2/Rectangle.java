public class Rectangle{
int length;
int width;
void Show(int n ,int r)
{
length=n;
width=r;
int area=length*width;
System.out.println("The area is :"+area);
}
void Show1(int n ,int r)
{
length=n;
width=r;
int perimeter=2*(length+width);
System.out.println("The perimeter is :"+perimeter);
}
public static void main(String[] args)
{
Rectangle r1=new Rectangle();
r1.Show(2,5);
r1.Show1(5,2);
}
}