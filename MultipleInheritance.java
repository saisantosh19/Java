class A
{
void method1()
{
System.out.println("method 1 in class A");
}
}
class B 
{
void method()
{
System.out.println("method 2 in class B");
}
}
class C extends A,B
{
}
class MultipleInheritance
{
public static void main(String args[])
{
C c=new C();
c.method();
}
}