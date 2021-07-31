import java.io.*;
class Deserialized1
{
     public static void main(String arg[])
	 { 
	      try
		  {
			   //Student m = null;
		       FileInputStream fin=new FileInputStream("D:\\Serializes.ser");
			   ObjectInputStream f=new ObjectInputStream(fin);
			   Object m=(Student)f.readObject();
			   fin.close();
			   //f.flush();
			   f.close();
			   
			   //Display() the data
			   System.out.println("Object of Student class is deserialized successfully.. ");
			   m.Check_Mail();
			   
		  }
		  catch(ClassNotFoundException e)
		  {
			  System.out.println(" O Oh! Error Caught... Class Is Not present Dood");
		  }
		  catch(Exception e)
		  {
		        System.out.println("O Oh!");
		  }
     }
}	