import  java.io.IOException;
class One
{
	 void msg() throws IOException
	 {   
		throw new IOException(" All Okay Don't Worry ");  
	 }
	 void m()
	 {
		   msg();
	 }
	 void n()
	 {
		 try
			 {
				 m();
			 }
			 catch(IOException e)
			 {
				   System.out.println(" MONA "+e);
			 }
	 }
      public static void main(String arg[])
	  {
	          One o = new One();
              o.n();	 
		      System.out.println(" Mona");
	  }
}