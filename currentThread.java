//Wap to demo of currentThread()
class Current extends Thread{
	 public void run()
	 {
		   System.out.println(Thread.currentThread().getName());
	 }
	 public static final void main(String arg[])
	 {
		   Current c1=new Current();
		   Current c2=new Current();
		    c1.start();
		    c2.start();
		 
	 }
}