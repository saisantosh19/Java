class Copy
{
int a,b;
Copy(int m,int n)
{
a=m;
b=n;
System.out.println("Value of a="+a);
System.out.println("Value of b="+b);
}
Copy(Copy c)
{
a=c.a;
b=c.b;
System.out.println("Value of a="+a);
System.out.println("Value of b="+b);
}
}
class CopyConstructor'
{
public static void main(String args[])
{
Copy c1=new Copy(10,20);
Copy c2=new Copy(c1);
}
} 