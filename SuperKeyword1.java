class A
{
void show()
{
System.out.println("Super class Method");
}
}
class B extends A
{
void show()
{
super.show();
System.out.println("sub class method");
}
}
class SuperKeyword1
{
public static void main(String args[])
{
B b=new B();
b.show();
}
}