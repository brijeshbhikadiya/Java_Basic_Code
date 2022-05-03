/*
class implemnts thay
interface extends thay                                        hybrid diagram
hybrid =multilevel +anyother inheritance
*/                                                             //a-- |   --b
interface A                                                       // |
{                                                                  //c
	int p=10;                                                      //|
	void showA();                                                  //d
}
interface B extends A
{
	int q=20;
	void showB();
}
class C implements A,B
{
	public void showA()                 //implements method ni synatax  accessmodifier returntype methodname()
	{
		System.out.println("p="+p);
	}
	public void showB()                 //implements method ni synatax  accessmodifier returntype methodname()
	{
		System.out.println("q="+q);
	}
}
class D extends C
{
	void display()
	{
		showA();
		showB();
	}
}
class Hybrid
{
	public static void main(String args[])
	{
	D c1=new D();
	c1.display();
	}
}