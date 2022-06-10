import java.lang.*;
class NegDemo
{
	public static void main(String args[])   
	{
		int i,count=0,num;
		int a[]=new int[5];
		for(i=0;i<args.length;i++)
		{
			num=Integer.parseInt(args[i]);
			a[i]=num;
		}
		for(i=0;i<args.length;i++)
		{
		if(a[i]<0)
		{
			count++;
		}
		}
		System.out.println("the total number of negative number is "+count);
	}
}