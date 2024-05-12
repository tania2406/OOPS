package oops;

enum days   // enum is a derived data type.
            // here we can't search element by index instead index is searched by the element using ordinal func.
            // here we can't enter no.
            // we can change the index of any element .
{
	mon,tue,wed,thur,fri,sat,sun
}
public class enume {

	public static void main(String args[])
	{
		days d=days.fri;
		System.out.println("day is "+d);
		System.out.println(d.ordinal());
		
		for(days x: days.values())
			System.out.println(x);
	}
}
