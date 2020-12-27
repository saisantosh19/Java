class MultipleException
{
public static void main(String args[])
{
try
{
int[] a=new int[2];
a[0]=10;
a[1]=20;
System.out.println(a[3]);
System.out.println(1/0);
}
catch(ArithmeticException e)
{
System.out.println(e);
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println(e);
}
}
}