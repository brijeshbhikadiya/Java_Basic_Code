/*
brijesh hareshbhai
*/
class TestStatic
{
	static int a=10;
	static int b=20;
	final int c=10;
	
	static void add()
	{
		
		System.out.println("b="+b);
		System.out.println("sum="+(a+b));
	}
	void getData()
	{
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
	}
	static 
	{
			System.out.println("i am in static method");
			b=b*4;
	}
}
class StaticEx1
{
	public static void main(String args[])
	{
		TestStatic ts1=new TestStatic();
		TestStatic.add();
		ts1.getData();
	}
}