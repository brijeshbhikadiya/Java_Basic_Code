/**/
class Test
{
	int m1,m2;
	
	Test(int a,int b)
	{
		m1=a;
		m2=b;
	}
	
	
	
		void getData()
	{
		System.out.println(" m1 = "+m1+" m2 = "+m2);
	}
}

class ParamCon
{
	public static void main(String args[])
	{
		Test t1=new Test(10,20);
		t1.getData();
		
		Test t2=new Test(30,40);
		t2.getData();
	}
}