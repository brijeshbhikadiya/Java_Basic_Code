class Test
{
	void area(int a)
	{
		System.out.println("the area of circle of="+(3.14*a*a));
	}
	
	void area(float a)
	{
		System.out.println("the area of squre is="+(a*a));
	}
	
	void area(int a,int b)
	{
		System.out.println("the area of rectangle ="+(a*b));
	}
	
	void area(int a,float b)
	{
		System.out.println("the area of triangle is="+(0.5*a*b));
	}
	
	
}
class MethodOverloading1
{
	public static void main(String args[])
	{
		Test t1=new Test();
		
		t1.area(12);
		t1.area(10f);
		t1.area(12,12);
		t1.area(12,11.11f);
	}
}