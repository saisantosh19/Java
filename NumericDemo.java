import java.awt.*;
import java.applet.*;
public class NumericDemo extends Applet
{
public void paint(Graphics g)
{
int a=10;
int b=20;
int sum=a+b;
String s=String.valueOf(sum);
g.drawString(s,10,100);
}
}


/*
<applet code="NumericDemo.class" width="300" height="300">
</applet>
*/