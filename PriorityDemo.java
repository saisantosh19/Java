class Thread1 extends Thread
{
public void run()
{
for(int i=1;i<=2;i++)
{
System.out.println("Child Thread");
}
}
}
class PriorityDemo
{
public static void main(String args[])
{
Thread t1=new Thread1();
System.out.println(t1.getPriority());
t1.setPriority(10);
t1.start();
for(int j=1;j<=2;j++)
{
System.out.println("Main Thread");
}
}
}
