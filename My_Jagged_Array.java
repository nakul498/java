import java.util.*
class My_Jagged_Array
{ 
	public static void main(String [] args){
 	Scanner sc= new Scanner (System.in);
	System.out.print("Enter the name of the Subject\t");
	int sub = sc.nextInt();
	String[] subject = new String [sub];
	double[][]marks = new double[sub][];
	for (i=0; i<sub;i++)
	{
		System.out.print("\nEnter the subject name\t");
		sc.nextLint();
		subject [i