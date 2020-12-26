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
class C extends A
{
void method3()
{
System.out.println("method 3 in class C");
}
}
class HierarchicalInheritance
{
public static void main(String args[])
{
C c=new C();
B b=new B();
c.method1();
c.method3();
b.method1();
b.method2();
}
}