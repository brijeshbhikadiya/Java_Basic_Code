import java.io.*;
class FilePrac4
{
	public static void main(String args[]) throws Exception
	{
		FileReader fr=new FileReader(args[0]);
		BufferedReader br=new BufferedReader(fr);
		
		FileWriter fw=new FileWriter(args[1]);  //step 1=file writer and file reader make.
		
		String s1,s2=" ",s3[];
		int count=0;
		
		while((s1=br.readLine())!=null)  //use only read string
		{
			s2=s2+s1; //use only string store
			s3=s1.split(" "); //use of count logic
		
			for(int i=0;i<s3.length;i++)
			{
				if(s3[i].equals(args[2]))
				{
				count++;
				}
			}
			
		}      //logic of count make
		System.out.println("count="+count);
		System.out.println("s2="+s2);
		
		String s4=s2.replaceAll((args[2]),(args[3]));  //replace all word 1 to word 2
		fw.write(s4);
		
		fw.close();
		br.close();
		fr.close();
		
	}
}