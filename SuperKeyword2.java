class One
{
int i;
One(int a)
{
i=a;
System.out.println(i);
}
}
class Two extends One
{
Two()
{
super(10);
System.out.println("sub class constructor");
}
}
class SuperKeyword2
{
public static void main(String args[])
{
Two t=new Two();
}
}