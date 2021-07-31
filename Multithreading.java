//Wap to demo of MultiThreading
class Employee extends Thread
{
	 public void run()  
	 {
		   System.out.println(" Thread Is created "+n);
     }
	 //terminated state
     public static void main(String arg[])
	 {
	       Employee e = new Employee() ;//It is in new Stage
		   e.start();                                   //runable state
		  // e.start();                                   //runable state
     }
}