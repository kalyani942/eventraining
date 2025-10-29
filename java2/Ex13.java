public class ThirdLarge
{
public static void main(String[]args)
{
int arr[]={10,20,40,30,60,70,89};
System.out.println("the second largest number is :");
int second=-1;
int large=-1;
int third=-1;
for(int i=1;i<arr.length;i++)
{
if(arr[i]>large)
{
third=second;
second=large;
large=arr[i];
}
else if(arr[i]>second)
{
third=second;
second=arr[i];
}
else if(arr[i]>third)
{
third=arr[i];
}
}
System.out.println(third);
}
}