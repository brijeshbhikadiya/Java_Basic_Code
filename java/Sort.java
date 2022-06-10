/*
brijesh bhikadiya
*/
class Test
{
	
	int a[]={10,35,23,45,20,25};
	void display()
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.println("a["+i+"]="+a[i]);
		}
	} 
	void sort()
	{
		int temp;
		for(int i=0;i<a.length-1;i++)   
		{
			for(int j=0;j<a.length-i-1;j++)// 1.6-0-1=5 2.6-1-1=4
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];   //temp=35;
					a[j]=a[j+1];  //35=23;
					a[j+1]=temp; //23=35;
				}
			}
		}
	}
}
class Sort
{
	public static void main(String args[])
	{
		Test t1=new Test();
		System.out.println("before sorting the element=");
		t1.display();
		t1.sort();
		System.out.println("after a sorting the element=");
		t1.display();
	}
}

