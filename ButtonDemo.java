import java.awt.*;
class ButtonDemo
{
public static void main(String args[])
{
Frame f=new Frame();
f.setVisible(true);
f.setSize(300,300);
f.setBackground(Color.pink);
f.setLayout(new FlowLayout());
Label l1=new Label("username");
Label l2=new Label("password");
TextField t1=new TextField(20);
TextField t2=new TextField(20);
t2.setEchoChar('*');
Button b=new Button("login");
f.add(l1);
f.add(t1);
f.add(l2);
f.add(t2);
f.add(b);
l1.setBounds(100,120,80,30);
t1.setBounds(100,130,80,30);
l2.setBounds(100,140,80,30);
t2.setBounds(100,160,80,30);
}
}