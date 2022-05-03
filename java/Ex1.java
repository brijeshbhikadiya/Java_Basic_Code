/*
brijesh bhiakdiya
*/
interface Transpot
{
	void deliver();
}
abstract class Animal
{
	abstract void deliver();
}
class Camel extends Animal implements Transpot
{
	public void deliver()
	{
		System.out.println("Camel deliver");
	}
}
class Donkey extends Animal implements Transpot
{
	public void deliver()
	{
		System.out.println("Donkey deliver");
	}
}
class Beer extends Animal
{
	void deliver()
	{}
}
class Tiger extends Animal
{
	void deliver()
	{}
}
class Ex1
{
	public static void main(String args[])
	{
		Animal a[]=new Animal[4];
		a[0]=new Tiger();
		a[1]=new Beer();
		a[2]=new Donkey();
		a[3]=new Camel();
		
		for(int i=0;i<4;i++)
		{
			if(a[i] instanceof Transpot)
			{
				a[i].deliver();
			}
		}
	}
}