//Wap to demo of Creating the frame With the help of association
import java.awt.*;
import java.awt.event.*;
public class Demo9
{
	 Demo9()
	 {
		     Frame f=new Frame();
		     f.setSize(500,500);
			 f.setVisible(true);
			 f.setLayout(null);
			 
			 Label l1 = new Label("Id");
			 l1.setBounds(150,100,60,70);
			 add(l1);

			 Button b=new Button(Click here);
			 b.setBounds(100,50,60,70);
			 f.add(b);
	 }
	 public static void main(String arg[])
	 {
		   Demo9 d=new Demo9();
	 }
}