class ArrayIndexException
{
public static void main(String args[])
{
int[] a=new int[2];
a[0]=10;
a[1]=20;
try
{
System.out.println(a[2]);
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println(e);
}
}
}