/*
brijesh hareshbhai
*/
abstract class Shape
{
	abstract void area();
}
class Triangle extends Shape
{
	int l,h;
	Triangle(int l,int h)
	{
		this.l=l;
		this.h=h;
	}
	void area()
	{
		System.out.println("area of triangle is"+(0.5*l*h));
	}
}
class Circle extends Shape
{
	int r;
	Circle(int r)
	{
		this.r=r;
	}
	void area()
	{
		System.out.println("area of Circle  is"+(r*r));
	}
}
class Ractangle extends Shape
{
	int b,a;
	Ractangle(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	void area()
	{
		System.out.println("area of triangle is"+(a*b));
	}
}
class Ex2
{
	public static void main(String args[])
	{
		Shape s;
		Triangle t=new Triangle(10,20);
		Circle c=new Circle(20);
		Ractangle r=new Ractangle(14,13);
		
		s=t;
		s.area();
		
		
		s=c;
		s.area();
		
		
		s=r;
		s.area();
	}
}
