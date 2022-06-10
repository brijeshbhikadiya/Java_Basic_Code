import java.util.*;
class Matrix
{
	int a[][]=new int[3][3];
	Scanner sc=new Scanner(System.in);
	void setMatrix()
	{
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
	}
	void getMatrix()
	{
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
			System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
	}
}

class MatrixThread1 extends Thread
{
	Matrix m;
	MatrixThread1(Matrix m)
	{
		this.m=m;
		start();
	}
	public void run()
	{
		int sum=m.a[0][0]+m.a[0][1]+m.a[0][2];
		System.out.println("sum"+sum);
	}
}

class MatrixThread2 extends Thread
{
	Matrix m;
	MatrixThread2(Matrix m)
	{
		this.m=m;
		start();
	}
	public void run()
	{
		int sum=m.a[1][0]+m.a[1][1]+m.a[1][2];
		System.out.println("sum"+sum);
	}
}

class MatrixThread3 extends Thread
{
	Matrix m;
	MatrixThread3(Matrix m)
	{
		this.m=m;
		start();
	}
	public void run()
	{
		int sum=m.a[2][0]+m.a[2][1]+m.a[2][2];
		System.out.println("sum"+sum);
	}
}
class MatrixCal
{
	public static void main(String args[])
	{
		Matrix m=new Matrix();
		m.setMatrix();
		m.getMatrix();
		MatrixThread1 m1=new MatrixThread1(m);
		MatrixThread2 m2=new MatrixThread2(m);
		MatrixThread3 m3=new MatrixThread3(m);
	}
}