package oops;

// Object as parameter:

     //class p6
     //{
     //	void call(p6 xyz)
     //	{
     //		System.out.println("from call");
     //	}
     //}
     //public class oops4 
     //{
     //      public static void main(String args[])
     //      {
     //    	  p6 p=new p6();
     //    	  p.call(p);
     //      }
     //}


// Return without any parameter:


//class p6
//{
//	int x=12;
//	int callme()
//	{
//		System.out.println("x is " +x);
//		return x+x+25+'b';
//		
//	}
//	
//}
//public class oops4
//{
//	public static void main(String args[])
//	{
//		p6 p=new p6();
//		System.out.println("value of return is "+p.callme());
//	}	
//}


// Return with parameter:

class p6
{
	int x='a';
	int callme(int p,int q)
	{
		System.out.println("x is " +x);
		return p+q+25+'b';
		
	}
	
}
public class oops4
{
	public static void main(String args[])
	{
		p6 p=new p6();
		System.out.println("value of return is "+p.callme(3,6));
	}
}