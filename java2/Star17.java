import java.util.*;
import java.util.Scanner;
public class Star17
{
public static void main(String[]args)
{
int n=5;
for(int i=1;i<=5;i++)
{
for(int j=5;j>i;j--)
{
System.out.print(" ");
}
for(int k=1;k<i;k++)
{
System.out.print("* ");
}
System.out.println();
}
for(int i=1;i<=3;i++)
{
for(int j=7;j>=i;j--)
{
System.out.print("* ");
}
for(int k=1;k<=i;k++)
{
System.out.print(" ");
}
System.out.println();
}
}
}