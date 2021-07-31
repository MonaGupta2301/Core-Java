import java.applet.Applet;
import java.awt.*;
import java.awt.Graphics;
public class Applet1 extends Applet
{
	    String msg="Ujjain MP-13";
	    public void init()
		{
			   setBackground(Color.cyan);
			   setForeground(Color.black);
			   msg+=" Madhya Pradesh";
		}
	    public void paint(Graphics g)
		{
			   g.drawString(msg,150,150);
			   showStatus("Okay");
		}
}
