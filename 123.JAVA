//Wap to demo of  Priority thread
class Priority extends Thread{
	 public void run()
	 {
		   System.out.println(Thread.currentThread().getName());
		   System.out.println(Thread.currentThread().getPriority());
	 }
	 public static final void main(String arg[])
	 {
		   Priority c1=new Priority();
		   Priority c2=new Priority();
			c1.setPriority(Thread.MIN_PRIORITY);
			c2.setPriority(Thread.MAX_PRIORITY);
//		c1.setPriority(Thread.NORM_PRIORITY);
//		c2.setPriority(Thread.NORM_PRIORITY);
                c1.start();
	        c2.start();	 
	 }
}
