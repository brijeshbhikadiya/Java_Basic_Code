/*
brijesh hareshbhai
*/
class A
{
	void show()
	{
		System.out.println("class a");
	}
}

class B extends A
{
	void show()
	{
		System.out.println("class b");
	}
}
class DMD1
{
	public static void main(String args[])
	{
		A a1=new A();
		a1.show();
		B b1=new B();
		b1.show();
		A b2=new B();   //this is a dynamic memory dispatch.
		b2.show();
	}
}
