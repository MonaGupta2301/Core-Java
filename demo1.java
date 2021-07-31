import java.awt.*;
class Demo1 extends Frameō
{
	   Demo1()
	   {
		       Button b = new Button(" Click Here ");
			   b.setBounds(300,50,60,20);
			   add(b);
			   setSize(700,900);
			   setBackground(Color.blue);
			   setLayout(null);
			   setVisible(true);
	   }
	   public static void main(String arg[])
	   {
		   Demo1 d= new Demo1();
	   }
}