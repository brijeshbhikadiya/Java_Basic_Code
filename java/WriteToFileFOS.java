/*
brijesh
*/
import java.io.*;
class WriteToFileFOS
{
	public static void main(String args[]) throws Exception
	{
		FileOutputStream fos=new FileOutputStream("abc.txt");
		//fos.write(65);
		//fos.close();
		String s="brijesh hareshbhai";
		byte b[]=s.getBytes();
		fos.write(b);
		fos.close();
	}
}