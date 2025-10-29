public class Ex10
{
public static void main(String[]args)
{
int arr[]={1,3,6,7};
int length=arr.length;
int key=7;
int flag=0;
for(int i=0;i<length;i++)
{
if(key==arr[i])
{
flag=1;
break;
}
}
if(flag==1)
{
System.out.println("element is found");
}
else
{
System.out.println("element is not found");
}
}
}