class TestThrows
{
	int a,b;
	TestThrows(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	void divide() throws ArithmeticException,NumberFormatException    //end of mathod signature
	{
		int ans=a/b;
		System.out.println("ans="+ans);
	}
	
}
class TestException6
{
	public static void main(String args[])
	{
		TestThrows tt1=new TestThrows(2044,0);
		tt1.divide();
		//niche lakhelu jo handle karavu hoy to lakhay baki hale
		/*try
		{
			tt1.divide();
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("do not enter 0="+e);
		}
		catch(NumberFormatException e)
		{
			System.out.println("please enter valid number format="+e);
		}*/
		
		
		
	}
}