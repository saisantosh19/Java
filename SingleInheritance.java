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
class SingleInheritance
{
public static void main(String args[])
{
B b=new B();
b.method1();
b.method2();
}
}