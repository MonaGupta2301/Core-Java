//Wap to demo of ==> Creat the thread with thehelp of runnablabe
class Student implements  Runnable
{
	  public void run()
	  {
		   System.out.println(" Thread Executing..");
	  }
	  public static void main(String arg[])
	  {
		    Student s = new Student();
			Thread t = new Thread(s);
			s.start();
	  }
}