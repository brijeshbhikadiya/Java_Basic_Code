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
class C extends A
{
	void show()
	{
		System.out.println("class c");
	}
}
class DMD2
{
	public static void main(String args[])
	{
		A r;             //making a reference variable of r.
		A a1=new A();
		B b1=new B();
		C c1=new C();
		r=a1;        //a1 are store in r. 
		r.show();    //call method using reference varable.
		r=b1;         //b1 are store in r. 
		r.show();
		r=c1;           //c1 are store in r.
		r.show();
		
	}
}
