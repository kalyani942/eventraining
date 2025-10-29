public class Ex11
{
public static void main(String[]args)
{
int arr[]={5,6,7,10,11,5,5,9,6,2};
int length=arr.length;
int key=5;
int count=0;
for(int i=0;i<length;i++)
{
if(key==arr[i])
{
count++;
}
}
System.out.println("my key value" +count+ "time appears");
}
}