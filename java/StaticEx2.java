/*
brijesh hareshbhai
*/
class TestStatic
{
	static int count=0;
	
	TestStatic()
	{
		count++;
	}
	void getData()
	{
		System.out.println("count="+count);
	}
}
class StaticEx2
{
	public static void main(String args[])
	{
		TestStatic ts1=new TestStatic();
		TestStatic ts2=new TestStatic();
		TestStatic ts3=new TestStatic();
		ts3.getData();
		
	}
}