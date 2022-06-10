/*ussing Runnable interface
to make name of Thread*/

class ThreadDemo2 implements Runnable
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("user Thread"+i);
			userThread();
		}
	}
	public void userThread()
	{
		Thread t=Thread.currentThread();
		String s=t.getName();
		System.out.println("Thread name"+s);
	}
	public static void main(String args[])
	{
		ThreadDemo2 td=new ThreadDemo2();   // runnable ma be obj. banavva padse
		Thread t1=new Thread(td,"First");    //Thread no start call karavava mate obj. banavo pade
		Thread t2=new Thread(td,"Second");         
		t1.start();
		t2.start();
			for(int i=0;i<5;i++)
		{
			System.out.println("main Thread"+i);
		}
	}
}