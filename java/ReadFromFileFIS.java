/*
brijesh bhikadiya
*/
import java.io.*;
class ReadFromFileFIS
{
	public static void main(String args[]) throws Exception
	{
		int i;
		FileInputStream fis=new FileInputStream("abc.txt");
		while((i=fis.read())!=-1)
		{
			System.out.println("char="+(char)i);
		}
	}
}