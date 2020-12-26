class Overloading
{
void add(int a,int b)
{
System.out.println("sum="+(a+b));
}
void add(int a,int b,int c)
{
System.out.println("sum="+(a+b+c));
}
}
class OverloadDemo
{
public static void main(String args[])
{
Overloading t=new Overloading();
t.add(10,20);
t.add(10,20,30);
}
}
