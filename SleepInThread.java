class Thread1 extends Thread
{
public void run()
{
for(int i=1;i<=5;i++)
{
try
{
if(i==2)
{
sleep(1000);
}
}
catch(Exception e)
{
System.out.println(e);
}
System.out.println("Thread1:"+i);
}
}
}
class SleepInThread
{
public static void main(String args[])
{
Thread t1=new Thread1();
t1.start();
}
}