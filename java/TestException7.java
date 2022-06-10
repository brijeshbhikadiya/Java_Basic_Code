/*throw: it used either anually created(new) or you caught by using throw key word (rethrow) 
throws: if mathod not handle checked Exception than mathod must declare it using throws
write a proggram that throw IOException When user enter 5.*/

//checked Exception:IOException and SQLException =>must be hendel karavu pade

import java.io.*;
class Demo
{
	int n1;
	void testException() throws IOException
	{
		if(n1==5)
		{
			throw new IOException();  //
		}
		else 
		{
			System.out.println("n1="+n1);
		}
	}
}
class TestException7
{
	public static void main(String args[])
	{
		Demo d1=new Demo();
		d1.n1=Integer.parseInt(args[0]);
		try  //IO and SQL ne hendel karavu
		{
			d1.testException();
		}
		catch(IOException e)
		{
			System.out.println("enter 5 val so IOException accur"+e);
		}
	}
}