interface A
{
void method1();
}
interface B extends A
{
void method2();
}
class C implements B
{
public void method1()
{
System.out.println("method 1 from interface A");
}
public void method2()
{
System.out.println("method 2 from interface B");
}
}
class InterfaceDemo
{
public static void main(String args[])
{
C c=new C();
c.method1();
c.method2();
}
}
