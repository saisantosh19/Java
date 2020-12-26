class A
{
void method1()
{
System.out.println("method 1 in class A");
}
}
class B extends A
{
void method2()
{
System.out.println("method 2 in class B");
}
}
class C extends B
{
void method3()
{
System.out.println("method3 in class C");
}
}
class MultilevelInheritance
{
public static void main(String args[])
{
C c=new C();
c.method1();
c.method2();
c.method3();
}
}