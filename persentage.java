//Wap TO Calculate the Percentage Od Student 
import java.util.Scanner;
class input
{
   public double per,Obtain_Marks;
   public int s1,s2,s3,s4,s5;
   public void getdata(int sub1,int sub2,int sub3,int sub4,int sub5)
   {
	   s1=sub1;
	   s2=sub2;
	   s3=sub3;
	   s4=sub4;
	   s5=sub5;
   }
   public void putdata()
   {
	  Obtain_Marks=(s1+s2+s3+s4+s5);
	  per=((Obtain_Marks/500)*100);
	  System.out.println("\n Persentage Of Student Is : "+per+"%");
   
   }
   public static void main( String args[])
   {
      int s1,s2,s3,s4,s5;
	  input i = new input();
      Scanner s = new Scanner(System.in);
	  System.out.println("\n ENter The Value Of Subject 1 : ");
	  s1=s.nextInt();
	  System.out.println("\n ENter The Value Of Subject 2 : ");
	  s2=s.nextInt();
	  System.out.println("\n ENter The Value Of Subject 3 : ");
      s3=s.nextInt();
	  System.out.println("\n ENter The Value Of Subject 4 : ");
	  s4=s.nextInt();
	  System.out.println("\n ENter The Value Of Subject 5 : ");
      s5=s.nextInt();
	  i.getdata(s1,s2,s3,s4,s5);
      i.putdata();
   }
}