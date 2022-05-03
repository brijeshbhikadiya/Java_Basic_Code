class Test
{
	void display()
	{
		System.out.println("now i am do function overloading method.");
	}
	
	void display(int a)
	{
		System.out.println("the value of a="+a);
	}
	
	void display(int a,int b)
	{
		System.out.println("the sum of a and b="+(a+b));
	}
	
	void display(float	a)
	{
		System.out.println("the float of a="+a);
	}
	
	
}
class MethodOverloading
{
	public static void main(String args[])
	{
		Test t1=new Test();
		
		t1.display();
		t1.display(10);
		t1.display(12,12);
		t1.display(11.11f);
	}
}