/*
brijesh hareshbhai
*/
class A
{
		private int p;
		private int q;
		
		void setData(int p,int q)
		{
			this.p=p;
			this.q=q;
		}
		void showData()
		{
				System.out.println("p="+p);
				System.out.println("q="+q);
		}
}
class B extends A
{
	void add()
	{
	 showData();
	}
}
class InheritDemo1
{
	public static void main(String args[])
	{
		
		B b1=new B();
		b1.setData(10,20);
		b1.add();
	}
}