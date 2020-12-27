class finally_Exception
{
public static void main(String args[])
{
try
{
System.out.println(1/0);
}
catch(NullPointerException e)
{
System.out.println(e);
}
finally
{
System.out.println("Completed");
}
}
}