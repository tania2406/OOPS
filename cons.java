package oops;

// Constructor:


class a
{
	int x;
	a()
	{
		x=0;
		System.out.println("from constructor");
	}
	a(int y)
	{
		x=y;
	demo();
	}
	void call()
	{
		System.out.println("x is "+x);
	}
	void demo() {
		System.out.println("from demo");
	}
}
public class cons {

	public static void main(String args[])
	{
		a p=new a();
		a p1=new a(120);
		p.call();
		p1.call();
	}
}
