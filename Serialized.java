import java.io.*;
class Serialized
{
     public static void main(String arg[])
	 {
	      try
		  {
			     Student s = new Student();
				 s.age=17;
				 s.name="Surbhi Sahu";
				 s.address="MJ_Colony";
				 s.roll=89;
				 s.per=87.90;
				 s.Mobile=9567;
				 
				 FileOutputStream fout = new FileOutputStream("D:\\Serializes.ser");
				 ObjectOutputStream f = new ObjectOutputStream(fout);
				 
				 f.writeObject(s);
				 f.flush();
				 f.close();
				 fout.close();
				 System.out.println("Object of Student class is serialized successfully in File ");
				 s.Check_Mail();
			  
		  }
		  catch(Exception e)
		  {
			   System.out.println();
		  }
	 }
}