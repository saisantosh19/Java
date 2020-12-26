class A
{
int i;
}
class B extends A
{
int i;
B(int a,int b)
{
super.i=a;
i=b;
}
void show()
{
System.out.println(super.i);
System.out.println(i);
}
}
class SuperKeyword3
{
public static void main(String args[])
{
B b=new B(10,20);
b.show();
}
}