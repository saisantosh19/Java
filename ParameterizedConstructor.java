class Parameterized
{
int a,b;
Parameterized(int m,int n)
{
a=m;
b=n;
System.out.println("Value of a="+a);
System.out.println("Value of b="+b);
}
}
class ParameterizedConstructor
{
public static void main(String args[])
{
Parameterized p=new Parameterized(10,20);
}
}