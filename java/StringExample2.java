class StringExample2
{
	public static void main(String args[])
	{
		String s1="Hello123 world456 lj789";
		int c1=0;
		int c2=0;
		int c3=0;
		for(int i=0;i<s1.length();i++)
		{
			char c=s1.charAt(i);
			if(c>='0' &&c <='9')
			{
				c1++;
			}
			else if(c>='A'&& c<='Z')
			{
				c3++;
			}
			else
			{
				c2++;
			}
		}
		System.out.println("number of lowercase="+c2+"number digit="+c1+"uppercase="+c3);
	}
}