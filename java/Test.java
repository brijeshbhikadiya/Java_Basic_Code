/*
brijesh
*/
class Test
{
	int m1,m2;
	
	void setData(int a,int b)
	{
		m1=a;
		m2=b;
	}
	void getData()
	{
		System.out.println("m1 is="+m1+"\tm2 is="+m2);
	}
	
	
	public static void main(String args[])
	{
		Test t1=new Test();
		t1.setData(10,20);
		t1.getData();
		
		Test t2=new Test();
		t2.setData(30,40);
		t2.getData();
	}
}