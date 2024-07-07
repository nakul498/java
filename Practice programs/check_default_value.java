import java.util.*;

class check_default_value
{	
	static int b; // make it c \class varible using static
	int c; 
	// default value is given to class and instance variable
	public static void main(String args[])
	{
		check_default_value obj = new check_default_value();
		int a;

		System.out.println(b);
		System.out.println(obj.c);
	//	System.out.println(a);	// it will give compilation error as we donot declare value of a .
	}
}