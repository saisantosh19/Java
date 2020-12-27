import java.awt.*;
import java.applet.*;
public class Test extends Applet
{
String str;
public void init()
{
str=getParameter("string");
}
public void paint(Graphics g)
{
g.drawString(str,10,100);
}
}




/*
<applet code="Test.class"width=500 height=500>
<PARAM name="string" value="Santosh">
</applet>
*/
