class thread1 extends Thread
{
public void run()
{       
for(int i=0;i<2;i++)
{           
System.out.println("Thread1:"+i);
}
}
}
class thread2 extends Thread
{
public void run()
{     
for(int j=0;j<2;j++)
{ 
System.out.println("Thread2:"+j); 
} 
}
}
class Threads 
{
public static void main(String[] args) 
{
thread1 ob1=new thread1(); 
thread2 ob2=new thread2();
ob1.start();
ob2.start();
}
}