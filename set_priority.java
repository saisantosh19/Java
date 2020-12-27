class thread1 extends Thread
{
public void run()
{
for(int i=0;i<5;i++)
{
System.out.println("thread1");
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
class thread2 extends Thread
{
public void run()
{
for(int i=0;i<5;i++)
{
System.out.println("thread2");
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


class set_priority
{
public static void main(String args[])
{
thread1 ob1=new thread1();
thread2 ob2=new thread2();
ob1.setPriority(2);
ob1.setPriority(1);
ob1.start();
ob2.start();
for(int i=0;i<5;i++)
{
System.out.println("Main thread");
}
}
}