/*
brijesh
producer consumer program.
*/
class ProCon
{
	boolean isMarked=false;
	int data;
	synchronized void producer(int n)
	{
		if(isMarked)
		{
			try
			{
				wait();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		data=n;
		System.out.println("i am producing "+data);
		isMarked=true;
		notify();
		
	}
	synchronized void consumer()
	{
		if(!isMarked)
		{
			try
			{
				wait();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		System.out.println("i am consuming"+data);
		isMarked=false;
		notify();
		
	}
	
}
class Producer extends Thread
{
	ProCon pc;
	int i;
	Producer(ProCon pc)
	{
		this.pc=pc;
		start();
	}
	public void run()
	{
	for(i=0;i<=5;i++)
	{
		pc.producer(i);
	}
	}
}
class Consumer extends Thread
{
	ProCon pc;
	int i;
	Consumer(ProCon pc)
	{
		this.pc=pc;
		start();
	}
	public void run()
	{
	for(i=0;i<=5;i++)
	{
		pc.consumer();
	}
	}
}
class ProConTest
{
	public static void main(String args[])
	{
		ProCon pc=new ProCon(); //procon name class aena object ne refer karshe.
		Producer p=new Producer(pc);
		Consumer c=new Consumer(pc); //thread
	}
}