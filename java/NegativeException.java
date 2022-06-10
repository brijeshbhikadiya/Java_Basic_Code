/*ex: CustomException if any of its command line  arguments are negative*/

class NegativeException extends Exception  //when you are extends exception so make complusary default constructor.
{
	NegativeException()
	{
		System.out.println("don't enter nagative number");
	}
}

class NegativeException1
{
	public static void main(String args[])  //ahiya negativeException throws no karu to chale kemke Unchecked che.
	{
		//int n=Integer.parseInt(args[0]);
		//int n1=Integer.parseInt(args[1]);
		//int n2=Integer.parseInt(args[2]);
		//try 
		//{
			//if(n<0 || n1<0 || n2<0)
			//{
				//throw new NegativeException();
			//}
			//else 
			//{
				//System.out.println("ohh it's positive number");
			//}
		//}
		//catch(NegativeException e)
		//{
			//System.out.println("hi catch"+" "+e);
		//}
		NegativeException nn=new NegativeException();
		try
		{
			for(int i=0;i<args.length;i++)
			{
				if((Integer.parseInt(args[i]))<0)
				{
					throw new NegativeException();
				}
				else
				{
					System.out.println(args[i]);
				}
			}
		}
		catch(NegativeException e)
		{
			System.out.println(e);
		}
		
	}
}