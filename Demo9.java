//Wap to demo of Creating the frame With the help of association
import java.awt.*;
import java.awt.event.*;
public class Demo9  implements ActionListener
{
	 TextField t;
	 Demo9()
	 {
		     Frame f=new Frame();
		     f.setSize(500,500);
			 f.setVisible(true);
			 f.setLayout(null);
			 
	        Button b=new Button("Click here");
			 b.setBounds(200,250,100,50);
			 t=new TextField();
			 t.setBounds(200,150,100,50);
			 f.add(t);
			 f.add(b);
			 
			 b.addActionListener(this);
	 }
	 
	 public void actionPerformed(ActionEvent e)
	 {
		    t.setText("Done..");
	 }
	 public static void main(String arg[])
	 {
		   Demo9 d=new Demo9();
	 }
}