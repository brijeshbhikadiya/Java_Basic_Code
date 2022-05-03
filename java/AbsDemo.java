/**/
abstract class A
{
	int a=10;
	
	void show()
	{
		System.out.println("a="+a);
	}
	abstract void add();
}
class B extends A
{
	void add()
	{
		System.out.println("sum="+(a+10));
	}
}
class AbsDemo
{
	public static void main(String args[])
	{
		B b1=new B();
		b1.show();
		b1.add();
	}
}

//aano loan valo example phonw ma che joi levo...........absttract class no and theory collage book...