/*
*/
class TwoDArray 
{
	public static void main(String args[])
	{
		int arr[][]=new  int[2][2];
		arr[0][0]=10;
		arr[0][1]=10;
		arr[1][0]=10;
		arr[1][1]=10;
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.println("arr["+i+"]["+j+"]="+arr[i][j]);
			}
		}
		
	}
}