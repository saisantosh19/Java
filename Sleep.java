class sync1 extends Thread
{
public void run()
{
for(int i=0;i<3;i++)
{
System.out.println("statement 1");
try
{
Thread.sleep(1000);
}
catch(InterruptedException e)
{
System.out.println(e);
}
}
}
}
class sync2 extends Thread
{
public void run()
{
for(int i=0;i<3;i++)
{
System.out.println("statement 2");
try
{
Thread.sleep(800);
}
catch(InterruptedException e)
{
System.out.println(e);
}
}
}
}
class Sleep
{
public static void main(String args[])
{
sync1 ob1=new sync1();
sync2 ob2=new sync2();
ob1.start();
ob2.start();
}
}
