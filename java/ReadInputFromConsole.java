/*
brijesh bhikadiya
*/
import java.io.*;
class ReadInputFromConsole
{
	public static void main(String args[]) throws Exception
	{
		BufferedInputStream bis=new BufferedInputStream(System.in);
		System.out.println("enter a character");
		char c=(char)bis.read();
		System.out.println("c="+c);
		
	}
}