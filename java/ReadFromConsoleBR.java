/*
brijesh
*/
import java.io.*;
class ReadFromConsoleBR
{
	public static void main(String args[]) throws Exception
	{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		String name="";
		while(!name.equals("stop"))
		{
			System.out.println("enter data");
			name=br.readLine();
			System.out.println("name="+name);
		}
		
	}
}