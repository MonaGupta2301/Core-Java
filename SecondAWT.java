import java.awt.*;
class SecondAWT extends Frame
{
	   SecondAWT()
	   {
			   TextField t1,t2;
			   t1=new TextField("First Name");
			   t1.setBounds(200,100,80,20);
               add(t1);

               t2=new TextField("Last Name");
			   t2.setBounds(200,100,80,20);	                  
               add(t2);
			   
			   setSize(300,300);
			   setVisible(true);
               setLayout(null);
               //setLayout(new FlowLayout());
	}
	   public static void main(String arg[])
	   {
		     SecondAWT s1=new SecondAWT();
	   }
}