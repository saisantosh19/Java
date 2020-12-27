import java.awt.*;
class MyFrame extends Frame
{
MyFrame()
{
setVisible(true);
setSize(300,300);
setBackground(Color.yellow);
setTitle("My Frame");
}
public static void main(String args[])
{
MyFrame m=new MyFrame();
}
}