class ForEach2
{
	public static void main(String args[])
	{
		int arr[][]={{10,20,30},{20,30,40}};
		for(int a[]:arr)
		{
			for(int b:a)
			{
			System.out.print("\t"+b);
			}
			System.out.println();
		}
	}
}