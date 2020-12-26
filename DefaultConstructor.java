class Constructor
{
int a,b;
Constructor()
{
a=10;
b=20;
System.out.println("Value of a="+a);
System.out.println("Value of b="+b);
}
}
class DefaultConstructor
{
public static void main(String args[])
{
Constructor c=new Constructor();
}
}