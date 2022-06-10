/*Syncronized in mathod 
two Thread in one class*/

class Test
{
	//synchronized void me()
	void me()
	{
		synchronized(this){            // or ahiya obj. sathe=> synchronized(obj)
		try
		{
			System.out.println("Good");
			Thread.sleep(500);
			System.out.println("Morning");
			Thread.sleep(500);
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
		}
	}
}
class Sync extends Thread
{
	Test t;
	Sync(Test t)
	{
		this.t=t;
	}
	public void run()
	{
		t.me();
	}
}
class SyncDemo 
{
	public static void main(String args[])
	{
		Test t1=new Test();
		Sync s1=new Sync(t1);
		Sync s2=new Sync(t1);
		s1.start();
		s2.start();
	}
}