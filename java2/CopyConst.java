public class CopyConst{
String name;
int id;
char c;
float d;
CopyConst(String n, int b, char p, float f){
name=n;
id=b;
c=p;
d=f;
System.out.println("c1="+name  +  id  +  c  +  d);
}
CopyConst(CopyConst ref){
name=ref.name;
id=ref.id;
System.out.println("c2="+name  +  id);
}
public static void main(String[] args){
CopyConst c1=new CopyConst("kalyani",100,'B',(float)6.9);
CopyConst c2=new CopyConst(c1);
}
}