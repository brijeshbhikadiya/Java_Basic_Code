/*
class implemnts thay
interface extends thay
*/
interface A
{
	int p=10;
	void show();
}
interface B extends A
{
	int q=20;
	//void show();
}
class C implements B
{
	public void show()                 //implements method ni synatax  accessmodifier returntype methodname()
	{
		System.out.println("p="+p+"q="+q);
	}
}
class Interface
{
	public static void main(String args[])
	{
	C c1=new C();
	c1.show();
	}
}