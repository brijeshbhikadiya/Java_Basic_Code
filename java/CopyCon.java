/*
BRIJESH HARESHBHAI
*/
class Test
{
	int m1,m2;
	
	Test()
	{
		m1=10;
		m2=20;
	}
	
	Test(Test t)
	{
		m1=t.m1;
		m2=t.m2;
	}
	
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

class CopyCon
{
	public static void main(String args[])
	{
		Test t1=new Test();
		t1.getData();
		
		Test t2=new Test(t1);
		t2.getData();
		
		Test t3=new Test(45,67);
		t3.getData();g
		
		Test t4=new Test(t3);
		t4.getData();
	}
}

//void setData()
//{
	//m1=10;
	//m2=20;
//}
//void setData(int a,int b)
//{
	//m1=a;
	//m2=b;
//}
//void setData()
//void setData(10,20)