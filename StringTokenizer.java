import java.util.StringTokenizer;
class Simple
{
     public static void main(String arg[])
	 {
          StringTokenizer  st  = new StringTokenizer("I,Like,To,Do,Arguments,With,my,Little,bro ",",");
		 System.out.println("Total number of tolens are :"+st.countTokens());
		  while(st.hasMoreElements())
		  {
			    System.out.println(st.nextElement());
		  }
		  System.out.println("Total number of tolens are :"+st.countTokens());
	 }		 
}