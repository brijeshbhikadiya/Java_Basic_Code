/*
brijesh hareshbhai
*/
class Test
{
	int m1,m2;
	
	void setData(int m1,int m2)
	{
		this.m1=m1;
		this.m2=m2;
		this.getData();
	}
	void getData()
	{
			System.out.println("m1="+m1+"m2="+m2);
	}
	Test()
	{
		this(3);
		Demo d=new Demo(this);
		System.out.println("i am in test constructor");
	}
	Test(int x)
	{
		m1=x;
		m2=x;
	}
	Test add(Test p,Test q)
	{
		m1=p.m1+q.m1;
		m2=p.m2+q.m2;
		return this;
	}
	
}

class Demo
{
	Demo(Test t)
	{
		System.out.println("i am in Demo");
	}
}
class ThisDemo1
{
	public static void main(String args[])
	{
	Test t1=new Test();
	t1.setData(10,20);
	
	Test t2=new Test();
	t2.getData();
	
	t1.getData();
	
	Test t3=t1.add(t1,t2);
	
	t3.getData();
	t1.getData();
	}
	
}