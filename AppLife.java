//wap to demo of applet life cycle
import java.applet.Applet;
import java.awt.*;
//import java.awt.Graphics;
/*<applet code="AppLife.java" width="400" height="600">
</applet>*/
public class AppLife extends Applet
{
	 String msg="The Current executing method";
	 public void init()
	 {
		 msg+=" int()";
	 }
	  public void start()
	 {
		 msg+=" start()";
	 }
	  public void stop()
	 {
		 msg+=" stop()";
	 }
	 public void paint(Graphics g)
	 {
		   g.drawString(msg,100,100);
		  // g.showStatus(" Testing applet");
	 }
}