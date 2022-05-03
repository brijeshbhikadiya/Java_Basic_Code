/**/
interface p
{
	int a=10;
	void display();
}
interface p1 extends p
{
	int b=20;
	void display();
}
interface p2 extends p
{
	int c=30;
	void display();
}
interface p12 extends p1,p2
{
	int d=40;
	void display();
}
class Q implements p12
{
	public void display()
	{
	System.out.println("a="+a);
	System.out.println("b="+b);
	System.out.println("c="+c);
	System.out.println("d="+d);
	}
}
class Ex3
{
	public static void main(String args[])
	{
		Q q=new Q();
		q.dispaly();
	}
}