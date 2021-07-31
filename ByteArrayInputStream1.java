import java.io.FileInputStream;
import java.io.ByteArrayInputStream;
class ByteArrayInput
{
   	  public static void main(String arg[])throws Exception
	  {
		    byte buf[]={ 67,34,56,67,89};
		    byte f[]={ 67,34,56,67,89};
			ByteArrayInputStream s = new ByteArrayInputStream(buf);
			int i=0;
			while((i=s.read())!=-1)
			{
				 System.out.println("Tthe ASCII Code is "+i+" The ASCII value is"+(char)i);
			}
			s.close();
	  }
}