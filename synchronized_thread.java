class Table
{
synchronized void print_table(int n)
{
for(int i=1;i<=10;i++)
{
System.out.println(n+"*"+i+"="+n*i);
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
class thread1 extends Thread
{
Table t1;
thread1(Table t)
{
this.t1=t;
}
public void run()
{
t1.print_table(5);
}
}
class thread2 extends Thread
{
Table t2;
thread2(Table t)
{
this.t2=t;
}
public void run()
{
t2.print_table(10);
}
}
class synchronized_thread
{
public static void main(String args[])
{
Table t=new Table();
thread1 ob1=new thread1(t);
ob1.start();
thread2 ob2=new thread2(t);
ob2.start();
}
}