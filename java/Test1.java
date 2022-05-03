/*
brijesh hareshbhai bhikadiya
*/
import java.util.*;
class Test1
{
	int m1,m2;
	
	void setData(int a,int b)
	{
		m1=a;
		m2=b;
	}
	void getData()
	{
		System.out.println("m1="+m1+"m2="+m2);
	}
	int total()
	{
		int c=m1+m2;
		return c;
	}
}
class TestDemo
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Test1 t1=new Test1();
		
		System.out.println("enter a first value=");
		int a=sc.nextInt();
		
		System.out.println("enter a second  value=");
		int b=sc.nextInt();
		
		t1.setData(a,b);
		t1.getData();
		
		int c=t1.total();
		System.out.println("total ="+c);
		
	}
}