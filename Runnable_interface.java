class thread1 implements Runnable
{
public void run()
{
for(int i=0;i<5;i++)
{
System.out.println("thread1:"+i);
}
}
}
class thread2 implements Runnable
{
public void run()
{
for(int i=0;i<5;i++)
{
System.out.println("thread2: "+i);
}
}
}
class Runnable_interface
{
public static void main(String args[])
{
thread1 ob1=new thread1();
Thread t1=new Thread(ob1);
thread2 ob2=new thread2();
Thread t2=new Thread(ob2);
t1.start();
t2.start();
}
}