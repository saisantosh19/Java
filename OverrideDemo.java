class A
{
void compute(double d)
{
System.out.println("Square is:"+(d*d));
}
}
class B extends A
{
void compute(double d)
{
System.out.println("Square root is:"+Math.sqrt(d));
}
}
class OverrideDemo
{
public static void main(String args[])
{
B b=new B();
b.compute(25);
A a=new A();
a.compute(5);
}
}
