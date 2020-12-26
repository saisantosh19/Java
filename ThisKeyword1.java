class Student
{
int rollno;
String name;
Student(int rollno,String name)
{
this.rollno=rollno;
this.name=name;
}
void display()
{
System.out.println(rollno+" "+name);
}
}
class ThisKeyword1
{
public static void main(String args[])
{
Student s=new Student(60,"sai");
s.display();
}
}