import java.awt.*;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.Event.*;
import java.awt.event.*;
class ThirdAWT extends Frame implements ActionListener
{
	   TextField t1,t2;
       ThirdAWT() 
	   {   
		    setSize(600,800);
    		setVisible(true);
			setTitle("Login page");
            setLayout(null);
			setBackground(Color.cyan);
			
			Label l =new Label("      Login here...");
	        l.setBounds(150,100,200,50);
            l.setBackground(Color.cyan);			
		    add(l);
			
			Label l1 =new Label("                Id  ");
	        l1.setBounds(50,200,200,50);
            l1.setBackground(Color.yellow);			
		    add(l1);	


			Label l2 =new Label("        Password  ");
	        l2.setBounds(50,300,200,50); 
            l2.setBackground(Color.yellow);			
		    add(l2);	
		
    	    t1=new TextField();
	        t1.setBounds(300,200,200,50); 
		    add(t1);	
		  
	        t2=new TextField();
	        t2.setBounds(300,300,200,50);
			add(t2);
			
			Button b=new Button("Click here");
			b.setBounds(150,400,200,50);
			b.setBackground(Color.red);
			add(b);
			
			Font f=new Font("Calisto MT",Font.BOLD,20);
			l1.setFont(f);
			l2.setFont(f);
			
			Font f1=new Font("Calendar",Font.ITALIC,20);
			Font f2=new Font("Calendar",Font.ITALIC,24);
			b.setFont(f1);
			l.setFont(f2);
			
			b.addActionListener(this);
			
        }		
       public void ActionPermofed(ActionEvent e)
	   {
                 if(t1.getText()=="MONA"&& t1.getText()=="mona123@")
				 {
					  Frame f = new Frame();
                      f.setSize(800,800);
                      f.setVisible(true);
                      f.setLayout(null);
                      f.setBackground(Color.yellow);					  
				 }
				 else
				 {
					 JOptionPane.showMessageDailog(this,"Invalid User Name And Password "," Error Generated");
				 }
	   }		   
	   public static void main(String arg[])
	   {
              ThirdAWT t = new ThirdAWT();		   
 	   }
} 