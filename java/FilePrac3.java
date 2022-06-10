
import java.io.*;  
class FilePrac3
{
	public static void main(String args[]) throws Exception
	{
		FileReader fr=new FileReader("abc.txt");
		FileWriter fw=new FileWriter("123.txt");
		BufferedReader br=new BufferedReader(fr);
			String s="";
			if((s=br.readLine())!=null)
			{
				fw.write(s);
			}
			
			fw.close();
			
	}
}
