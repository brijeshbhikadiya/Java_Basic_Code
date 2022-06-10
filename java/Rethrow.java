
import java.io.*;
class Test
{
		int n;
		Test(int n)
		{
			this.n=n;
		}
		void check() throws IOException 
		{
			try
			{
				if(n==2)
				{
					throw new IOException();
				}
			}
			catch(IOException e)
			{
				System.out.println("first catch");
				throw e;
			}
		}

}
class Rethrow
{
		public static void main(String args[])
		{
			Test t=new Test(2);
			try
			{
				t.check();
			}
			catch(IOException e)
			{
				System.out.println("Second catch");
			}
		}
}