import java.util.*;
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
		subject [i] = sc.nextLine();
		System.out.println("Enter number of CA"+Subject[i]+"\t");
		int ca = sc.nextINt();
		marks[i] = new double[ca];
		for(int j=0; j<ca; j++)
		{
			System.out.println("\nEnter Marks of CA"+(j+1)+"\t");
			marks[i][j] = sc.nextDouble;
		}
	}
	My_Jagged_Array ob= new My_Jagged_Array();
	printResult(marks,subject);
}
Void printResult(double [][]m, String[]n)
{
	char grade[] =FindGrade(m);
	System.out.println("\n\tResult - Jan 2021");
	System.out.println("\t -------------------------------------");
	for(i=0;i<m.length;i++)
	{
		System.out.prntln(n[i]+"\t\t");
		for(int j=0;j<m[i].length;j++)
		{
			System.out.println(m[i][j]+"\t");
			System.out.println(grade[i]);
		}
	}
}
private static char[] FindGrade(double [][]m)
{
	char[] grade=new char[m.length];
	for(int i=0; i<m.length;i++)
	{
		double per=0.0, sum=0.0;
		for(int j=0;j<m[i].lenght;j++)
			sum=sum+m[i][j];
			double total= 30*m[i].length;
			per=(sum/total)*100;
			if(per >=90)
				grade[i]='0';
	}
	return(grades);
}	