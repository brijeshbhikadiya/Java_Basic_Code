import java.io.*; 
class test 
{ 
	public static void main(String s[]) throws IOException 
	{ 
		File f1 = new File(s[0]); 
 
		if(f1.isFile()) 
		{ 
		System.out.println("File size="+f1.length()); 
		} 
		else if(f1.isDirectory()) 
		{ 
		System.out.println(f1.getAbsolutePath()+" is a directory"); 
		String s1[]=f1.list(); 
		System.out.println("It contains..."); 
		for(int i=0;i<s1.length;i++) 
		{ 
		File f2=new File(f1.getAbsolutePath()+"/"+s1[i]); 
		if(f2.isDirectory()) 
		{ 
		System.out.println(s1[i]+" as a directory"); 
		} 
		else 
		{ 
		System.out.println(s1[i]+" as a file"); 
		} 
		} 
		} 
		else 
		{ 
			System.out.println("it is not present as file or directory"); 
		} 
	} 
}