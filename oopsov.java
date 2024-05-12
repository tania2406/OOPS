package oops;

//class p5
//{
//	void call()
//	{
//		System.out.println("from call");
//	}
//	void call(int x)
//	{
//		System.out.println("x is "+x);
//	}
//}
//public class oopsov {
// public static void main(String args[])
// {
//	 p5 p=new p5();
//	 p.call();
//	 p.call(12);
// }
//}


class p5
{
	void call(int ...args) // three dots allow to pass more than one argument at a time.
	{
		for(int a:args)
			System.out.print(a+" ");
	}
}
public class oopsov
{
	public static void main(String args[])
	{
		p5 p=new p5();
		int data[]= {12,33};
		int kk[]= {90,44,33,22,11};
		p.call(kk);
		p.call(data);
	}
}