public class ThirdLargeSame
{
public static void main(String[]args)
{
int arr[]={10,20,40,30,60,70,89,89};
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
else if(second==arr[i])//(arr[i]>second && arr[i]!=large && arr[i]!=third)
{
third=second;
second=arr[i];
}
else if(third==arr[i])//(arr[i]>third && arr[i]!=second && arr[i]!=large)
{
third=arr[i];
}
}
System.out.println(third);
}
}