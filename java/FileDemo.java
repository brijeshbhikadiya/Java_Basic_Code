/*
brijesh hareshbhai 
*/
import java.io.*;
class FileDemo
{
	public static void main(String args[]) throws Exception
	{
		File f1=new File("abc.txt");
		File f3=new File("cde.txt");
		f3.createNewFile();
		if(f1.createNewFile())
		{
			System.out.println("file is created");
		}
		else
		{
			System.out.println("file is already exist.");
		}
		File f2=f1.getCanonicalFile();
		System.out.println("f1="+f1);
		System.out.println("f2="+f2);
		
		System.out.println("getabsolutepath="+f2.getAbsolutePath());
		System.out.println("parent path="+f2.getParent());
		
		boolean isExist=false;
		
		System.out.println("parent path="+f2.canWrite());
		System.out.println("parent path="+f2.canRead());
		System.out.println("parent path="+f2.isAbsolute());
		System.out.println("parent path="+f2.isFile());
		System.out.println("parent path="+f2.isDirectory());
		System.out.println("parent path="+f2.length());
		
	}
}