import java.io.*;
class FilePrac7
{
	public static void main(String args[]) throws Exception
	{
		RandomAccessFile raf=new RandomAccessFile(args[0],"rw");
		long pos=raf.length();
		for(long i=pos-1;i>=0;i++)
		{
			raf.seek(i);
			byte b=raf.readByte();
			System.out.println((char)b);
		}
	}
}