import java.util.*;

class check_default_value
{	
	static int b; // make it c \class varible using static 
	public static void main(String args[])
	{
		int a;
		System.out.println(b);
		System.out.println(a);	// it will give compilation error as we donot declare value of a .
	}
}