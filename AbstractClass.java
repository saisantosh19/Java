abstract class One
{
abstract void calculate(double x);
}
class Two extends One
{
void calculate(double x)
{
System.out.println("Square="+(x*x));
}
}
class AbstractClass
{
public static void main(String args[])
{
Two t=new Two();
t.calculate(25);
One o;
o=t;
o.calculate(5);
}
}