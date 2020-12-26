class Student
{
int rollno;
String name;
Student()
{
System.out.println("Default Constructor");
}
Student(int r,String n)
{
this();
rollno=r;
name=n;
this.display();
}
void display()
{
System.out.println(rollno+" "+name);
}
}
class ThisKeyword3
{
public static void main(String args[])
{
Student s=new Student(60,"sai");
}
}