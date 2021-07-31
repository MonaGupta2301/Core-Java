//Wap to demo of Command Line
class Cmd
{
  public static void main(String arg[])
  {
	 String sum=null;
     System.out.println(" Number of Arguments are :"+ arg.length);
	 for(int i=0;i<arg.length;i++)
     {
		sum=(sum+arg[i]); 
     }
	 System.out.println(" Sum is : "+(sum));
  }	 
}