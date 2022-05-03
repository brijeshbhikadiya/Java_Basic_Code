/**/
import java.util.*;
class TwoDArray1
{
	public static void main(String args[])
	{
		int arr[][]=new int[2][3];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(arr[i][j]+"\t");
			}
				System.out.println("");
		}
	}
}