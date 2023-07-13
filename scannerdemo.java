import java.util.*;
class input
{
 public static void main (String args[])
{
	Scanner sc = new Scanner(System.in);
	System.out.println("enter Name");
	String name = sc.nextLine();
	//System.out.print(name);
	System.out.println("enter YOUR cgpa");
	double cgpa = sc.nextDouble();
	System.out.println("Hello"+name+"your CGPA is "+cgpa);
	System.out.println("testing n will consume by next line or not");
	sc.nextLine();
	String demo = sc.nextLine();
	System.out.println(demo);
}
}
	