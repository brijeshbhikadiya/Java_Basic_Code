/*
brijesh hareshbhai
*/
class Test
{
	int m1,m2;
	
		Test add(int a,int b)
		{
			Test t=new Test();
			t.m1=a+b;
			t.m2=a*b;
			return t;
		}
		
		Test add(Test p,Test q)
		{
			Test t=new Test();
			t.m1=p.m1+q.m1;
			t.m2=p.m2*q.m2;
			return t;
		}
		void getData()
		{
			System.out.println("m1="+m1+"m2="+m2);
		}
}
class ObjectReturn
{
	public static void main(String args[])
	{
		Test t1=new Test();
		Test t2=new Test();
		Test t3=new Test();
		t1=t1.add(5,6);
		t1.getData();
		
		t2=t2.add(3,4);
		t2.getData();
		
		t3=t3.add(t1,t2);   //ahiya t1.  t2. t3.  karishakay
		t3.getData();
		
		
	}
}
