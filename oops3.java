package oops;

//class p3
//{
//	int x=12;
//	void call()
//	{
//		System.out.println("x is "+x);
//		
//		System.out.println("this x is "+this.x);
//		this.callme();// this keyword is used to call non static func.of same class.
//		callme();
//	}
//	void callme()
//	{
//		System.out.println("from call me");
//	}
//}
//public class oops3 {
//
//	public static void main(String args[])
//	{
//		p3 p=new p3();
//		p.call();
//	}
//}
 
class p4
{
	void call(p4 p)// it is called by object of same class.
	{
		System.out.println("from call");
	}
}
public class oops3
{
	public static void main(String args[])
	{
		p4 p=new p4();
		p.call(p);
	}
}