/*use current Thread  ni  Mathods(book ma laki che)*/
class ThreadDemo4 extends Thread
{
	public void run()
	{
		System.out.println("hi user Thread");
	}
	public static void main(String args[])
	{
		ThreadDemo4 td1=new ThreadDemo4();
		Thread t1=Thread.currentThread();
		
		td1.setName("OOPJ");
		td1.setPriority(2);   // 1<= priority <=10
		System.out.println("td1="+td1);
		System.out.println("user Thread="+td1.getName());
		td1.start();
		
		t1.setName("LJ");
		t1.setPriority(3);
		System.out.println("t="+t1);
	}
}