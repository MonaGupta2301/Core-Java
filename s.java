class Mona
{
	//void data();
	void data()
	     {
		      System.out.println("Dady's Mona Mumma's Prabhu....");
       	 }	
}
class Prabhu
{
	public static void main(String arg[])
	{
        Mona m=new Mona(){
	        void data()
	        {
		         System.out.println("Dady'sPrabhu Mumma's Mona ....");
       	     }
	     };
		     m.data();
	}
}