class Test
{
int a,b;
Test()
{
a=10;
b=20;
System.out.println("Value of a="+a);
System.out.println("Value of b="+b);
}
Test(int m,int n)
{
a=m;
b=n;
System.out.println("Value of a="+a);
System.out.println("Value of b="+b);
}
}
class ConstructorOverload
{
public static void main(String args[])
{
Test t1=new Test();
Test t2=new Test(30,40);
}
}