package oops;

//Ecapsultion
//Abstraction
//Polymorphism
//Inheritance

class p1
{
 int x=120;// class /instance variable
 static int z=80;//instance variable will always be global variable.
 final int p=400;// new value can't be asigned 
	void call()
	{ int y=900;// local variable can't be access outside class.
		System.out.println("x in p1 " +x);
		//p++;
		System.out.println("value is "+p/5);
		System.out.println("value of y is "+y);
	}
}
public class oops1
{
	public static void main(String args[])
	{
		p1 p=new p1();
		p.call();
		new p1().call();// another method of calling variable.
		System.out.println(p.x);
		System.out.println(p1.z);
		//System.out.println(p.y);
		System.out.println(Math.sqrt(900));
	}
}
