import java.util.*;
class banking 
{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("********WELCOMEM TO BANK********");
		System.out.println("*  ENTER ACCOUNT TYPE - SAVING OR CURRENT");
		System.out.print("*");
		System.out.print("*"); 
		String type = sc.nextLine();
		System.out.println("*  ENTER AGE");
		System.out.print("*");
		int age = sc.nextInt();
		char eli = age>23?'Y':'N';
		switch(type){
		case "SAVING":
			System.out.print("*\t you have selected SAVING and your age is "+age);
			if (eli == 'Y')
			System.out.print("*\t you are eligible for opening SAVING Account");
			else 
			System.out.print("*\t you need to open current account due to age limit");
			break;
		case "CURRENT":
			System.out.print("*\t you have selected CURRENT account and your age is "+age);
			System.out.print("*\t you are eligible for opening SAVING Account");			
			break;
		default:
			System.out.print("*\t wrong input");
		}
					
		System.out.println("*************************************************************");
	}
}