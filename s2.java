//Wap to demo of Annonomous inner class
abstract class Addition
{
	 abstract void sum(int x,int y);
}
class Test
{
	static int p=23,q=45;
    public static void main(String arg[])
    {
		   Addition a = new Addition()
		   {
		        void sum(int x, int y)
				{
					 System.out.println(" Addition of two number is :"+(x+y));
				}
		   };
		   a.sum(p,q);
    }		
}