public class Ex6
{
public static void main(String[]args)
{
int arr[]={10,5,30,40,50};
int large=arr[0];
for(int i=1;i<arr.length;i++)
{
if(arr[i]>large)
{
large=arr[i];
}
}
System.out.println(large);
}
}