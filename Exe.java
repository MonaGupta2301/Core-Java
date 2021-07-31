import  java.io.*;
class Mona
{
	void M() throws IOException
	{
		//throw new IOException(" Solve the Error");
		System.out.println(" IOException performed successfully");
	}
}
class S
{
   public static void main( String aed[])throws IOException
   {
	    S m =new S();
		m.M();
        System.out.println(" <===== Rest Of The Code Executed ====> ");
   }
}