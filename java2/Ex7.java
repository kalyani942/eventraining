public class Ex7
{
public static void main(String[]args)
{
int arr[]={10,5,30,40,50};
int small=arr[0];
for(int i=1;i<arr.length;i++)
{
if(arr[i]<small)
{
small=arr[i];
}
}
System.out.println(small);
}
}