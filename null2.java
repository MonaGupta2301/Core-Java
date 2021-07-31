//wap to handle NullPointerException error
class Nullexc
{
	public static void main(String args[])
	{
		try{
		      String s=null;
		      System.out.println(s.length());
	       }
		  catch(NullPointerException n)
		  {
     		  System.out.println("cant calculate length of null string");
	    	  System.out.println("\n system error:\n"+n);
		  }		  
	} 
}
