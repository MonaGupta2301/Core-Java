//Wap to demo of method of thread class such as setName.getName,getId
class Multi6 extends Thread
{
	  public void run()
	  {
		    System.out.println(" Running State...");
	  }
	  final static public void main(String arg[])
	  {
		     Multi6 m1=new Multi6();
		     Multi6 m2=new Multi6();
			 System.out.println(" Name of thread 1 is :"+m1.getName());
			 System.out.println(" Name of thread 2 is :"+m2.getName());
			 System.out.println(" Id of thread 1 is :"+m1.getId());
			 System.out.println(" Id of thread 2 is :"+m2.getId());
			 
			 m1.start();
			 m2.start();
			 
			 m1.setName("Thread1");
			 m2.setName("Thread2");
	         System.out.println(" Name of thread 1 is :"+m1.getName());
			 System.out.println(" Name of thread 2 is :"+m2.getName());
			 
	  }
}    