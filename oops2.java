package oops;


class p2
{ 
	void call(int x,int y)
	{ System.out.println(x+y);
	   //show();
	}
	void show(Integer i,String s)
	{		System.out.println(i);
		System.out.println(s);
	//	demo();
}
      void demo(int a[],Double d[])
	{ 
    	  for(int x:a)
		System.out.println(x);
    	  for(double x:d)
    	  System.out.println(x);
	}
}
public class oops2 {
public static void main(String args[])
{
	p2 p=new p2();
	p.call(12,90);
    p.show(12, "ranchi city");
    int []pp= {12,33,44,55};
    Double dx[]= {12.90,90.43};
    p.demo(pp, dx);
	
}
}
