class Command
{
	public static void main(String args[])
	{
		System.out.println("print all String as you entered at run time:");
		
		for(int i=0;i<args.length;i++)
		{
			System.out.println(args[i]);
		}
	}
}