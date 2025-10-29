public class SecondLarge
{
public static void main(String[]args)
{
int arr[]={60,10,20,40,30,60,60,70,89};
System.out.println("the second largest number is :");
int second=-1;
int large=-1;
int item;
for(int i=1;i<arr.length;i++)
{
if(arr[i]>large)
{
second=large;
large=arr[i];
}
else if(second==arr[i])
{
second=arr[i];
}
}
System.out.println(second);
}
}