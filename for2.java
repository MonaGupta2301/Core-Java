import java.awt.*;
import java.awt.event.*;
class For2 implements ActionListener
{
	    public static void main(String arg[])
	   { 
	  	      Frame f = new Frame();
		      f.setSize(500,300);
			  f.setVisible(true);
			  f.setLayout(null);
			  
			  final TextField tf=new TextField();
			  tf.setBounds(200,100,90,40);
			  f.add(tf);
			  
			  Button b=new Button("Click me");
			  b.setBounds(200,150,90,40);
			  f.add(b);
			  b.addActionListener(this);
			  
	   }
	   public void actionPerformed(ActionEvent e)
	   {
		    tf.setText("Well Done Boss...");
	   }  
}