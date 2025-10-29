public class Lcm1
{
public static void main(String[] args)
{
int a=5;
int b=4;
int max;
int lcm;
if(a>b)
{
max=a;
}
max=b;
while(true)
{
if(max%a==0 && max%b==0)
{
lcm=max;
break;
}
max++;
}
System.out.println(lcm);
}
}