import java.io.FileOutputStream;
import java.io.ByteArrayOutputStream;
class ByteArrayInputStream{
	  public static void main(String arg[])throws Exception{
		    FileOutputStream fout1=new FileOutputStream("E:\\ByteArray1.txt");
		    FileOutputStream fout2=new FileOutputStream("E:\\ByteArray2.txt");
			ByteArrayOutputStream s = new ByteArrayOutputStream();
			s.write(65);
			s.writeTo(fout1);
			s.writeTo(fout2);
			s.flush();
			fout1.close();
			fout2.close();
	  }
}