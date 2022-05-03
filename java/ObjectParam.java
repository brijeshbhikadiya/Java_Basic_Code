/*
brijesh hareshbhai bhikadiya
*/


class Test
{
	int m1,m2;
	
	void setData()
	{
		m1=10;
		m2=30;
	}
	
	void getData()
	{
		System.out.println(" m1 = "+m1+" m2 = "+m2);
	}
	
	void setData(int a)
	{
		m1=a;      //5
		m2=2*a;    //10
	}
	
	int add()
	{
		return m1+m2;  //5+10  //15
	}
	
	void add(Test t)
	{
		m1=t.m1+t.m2; //5+10=15
		m2=t.m1*t.m2; //5*10=50   //15+50=65
		System.out.println(" sum of m1 and m2 ="+(m1+m2));
	}
	
	void add(Test p,Test q)
	{
		m1=p.m1+q.m1; //5+15=20
		m2=p.m2*q.m2; //10*50=500   //20+500=520
		System.out.println(" sum of m1 and m2 ="+(m1+m2));
	}
	
	//Test add(Test p,Test q)
	//{
		//Test t;
		//t.m1=p.m1+q.m1; 
		//t.m2=p.m2*q.m2; 
		//return t;
		
	//}
	
}

class ObjectParam
{
	public static void main(String args[])
	{
			Test t1=new Test();
			Test t2=new Test();
			Test t3=new Test();
			t1.setData();
			t1.getData();
			
			t1.setData(5);
			t1.getData();
			
			int ans=t1.add();
			System.out.println(" ans = "+ans);
			
			t2.add(t1);
	
		    t3.add(t1,t2);
			
			//Test t4=t1.add(t2,t3);
			//System.out.println(t4);
	}
}