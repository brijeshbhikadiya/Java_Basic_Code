import java.util.*;
class TwoDArray3
{
	public static void main(String args[])
	{
		int a[][]={{1,2,3},{4,5,6},{7,8,9}};
		int b[][]={{3,2,1},{6,5,4},{9,8,7}};
		int c[][]=new int[3][3];
		Scanner sc=new Scanner(System.in);
		System.out.println("matrix A is");
		for(int i=0;i<3;i++)
				{
					for(int j=0;j<3;j++)
					{
						System.out.print(a[i][j]+"\t");
					}
					System.out.println();
				}
				System.out.println("matrix b is");
		for(int i=0;i<3;i++)
				{
					for(int j=0;j<3;j++)
					{
						System.out.print(b[i][j]+"\t");
					}
					System.out.println();
				}
		System.out.println("1.adition");
		System.out.println("2.substraction");
		System.out.println("3.multipliction");
		System.out.println("enter a your choice:");
		int n=sc.nextInt();
		switch(n)
		{
			case 1:for(int i=0;i<3;i++)
				{
					for(int j=0;j<3;j++)
					{
						c[i][j]=a[i][j]+b[i][j];
					}
				}
				for(int i=0;i<3;i++)
				{
					for(int j=0;j<3;j++)
					{
						System.out.print(c[i][j]+"\t");
					}
					System.out.println();
				}
				break;
				case 2:
				for(int i=0;i<3;i++)
				{
					for(int j=0;j<3;j++)
					{
						c[i][j]=a[i][j]-b[i][j];
					}
				}
				for(int i=0;i<3;i++)
				{
					for(int j=0;j<3;j++)
					{
						System.out.print(c[i][j]+"\t");
					}
					System.out.println();
				}
				break;
				case 3:
			
				for(int i=0;i<3;i++)
				{
					for(int j=0;j<3;j++)
					{
							c[i][j]=0;
							for(int k=0;k<3;k++)
							{
								c[i][j]=c[i][j]+a[i][k]*b[k][j];
							}
					}
				}
				for(int i=0;i<3;i++)
				{
					for(int j=0;j<3;j++)
					{
						System.out.print(c[i][j]+"\t");
					}
					System.out.println();
				}
				break;
		}
	}
}