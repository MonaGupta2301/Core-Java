import  java.io.*;
class Mona
{
	void m() throws IOException
	{
		throw new IOException(" Solve the Error");
	}
	void n() throws IOException
	{
		 m();
	}
	void p()
	{
		try
		{
			n();
		}
		catch(Exception e)
		{
			 System.out.println(e);
		}
	}
   public static void main( String aed[])
   {
	    Mona m =new Mona();
		m.p();
        System.out.println(" <===== Rest Of The Code Executed ====> ");
   }
}
