import java.util.*;
class Employee
{
	String name;
	int emp_id, salary;
	// constructor
	employee(String n, int id, int sal)
	{ 
		name = n;
		emp_id = id; 
		salary = sal;
	}
}
class ArrayDemo
{
	//Implement a method which takes an array of Employee as an argument along with id
	public Employee[] searchEmployee(Employee[]x, int id)
	{
		Employee[] Filtered = new Employee[x.length];
		int i = 0;
		//filter the Employee having emp_id>id`
 		for(Employee emp:x)
		{
			if(emp emp_id >id)
			{ 
				Filtered[i++]= emp;
			}
		}
		return filtered;	
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("\nHow many employee you want to store:");
		int size = sc.nextInt();
		Employee[] emps = new Employee[size];
		sc.nextLine(); // to consume the \n of next int all the method apart fron next line leaves a \n in buffer")
		for(int i = 0; i<size; i++)
		{	
			System.out.println("\n\t**********Employee"+(i+1)+"*******\n");
			System.out.println("Enter the name of Employee:\t");
			String name = sc.nextLine();
			System.out.println("\nEnter employee id :\t"); 
			int id = sc.nextInt();
			System.out.println("\n Enter Salary:\t);
			int sal = sc.nextInt();
			//creating Employee object
			Employee e= new Employee(name,id,sal);
			emp[i]=e;	
		}
		
	}
}
public Employee[] search Employee(Employee[]x, int id)
{ 
	//filter the Employee having emp_id>id 
	for(employee emp : x) 
	{ 
		if (emp emp_id > id)
		Filter 