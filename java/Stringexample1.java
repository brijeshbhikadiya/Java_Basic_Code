class StringExample1
{
	public static void main(String args[])
	{
		String s1="hello";
		String s2="Hello";
		char c=s1.charAt(3);
		System.out.println("indext is="+c);  //char at string use....
		
		
		System.out.println("concat String is is="+s1.concat(s2));
		
		if(s1.compareTo(s2)==0)
		{
			System.out.println("String is equals");
		}
		else
		{
			
			
			
			System.out.println("String is  not equals");
		}
		
		if(s1.compareToIgnoreCase(s2)==0)
		{
			System.out.println("String is equals");
		}
		else
		{
			System.out.println("String is  not equals");
		}
		
		if(s1.endsWith("o"))
		{
			System.out.println("you are right");
		}
		else
		{
			System.out.println("you are wrong");
		}
		
		if(s1.equals(s2))
		{
			System.out.println("String is equals");
		}
		else
		{
			System.out.println("String is  not equals");
		}
		
		if(s1.equalsIgnoreCase(s2))
		{
			System.out.println("String is equals");
		}
		else
		{
			System.out.println("String is  not equals");
		}
		
		
		System.out.println("length ="+s1.length());
		System.out.println("length ="+s1.toLowerCase());
		System.out.println("length ="+s1.toUpperCase());
		
	
	}
}