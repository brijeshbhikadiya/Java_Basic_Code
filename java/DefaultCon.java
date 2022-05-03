class Test
{
	int m1,m2;
	
	Test()
	{
		m1=10;
		m2=20;
	}
	
	void getData()
	{
		System.out.println(" m1 = "+m1+" m2 = "+m2);
	}
}

class DefaultCon
{
	public static void main(String args[])
	{
		Test t1=new Test();
		t1.getData();
	}
}