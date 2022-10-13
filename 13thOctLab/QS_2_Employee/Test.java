/* Program :Create a class Employee. Inherit 2 classes 
Hourly employeeand Salaried Employee  and functionality . Create a test class		
		
 
@Part - 4  - Test.java 
@author: Ayan Singha
@Date : 13 Oct 2022
@Lab Assesment by Shuruti Singhal Mam 
@Version: 1
*/
import java.util.Scanner;
public class Test
 {

	public static void choice() 
	{

		System.out.println("REGISTER  YOUR  EMPLOYEE  HERE  ");
		System.out.println("PRESS 1 FOR PERMANENT  EMPLOYEE ");
		System.out.println("PRESS 2 FOR HOURLY  EMPLOYEE ");
		System.out.println("Enter your choice ");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		switch(choice)
		{
			case 1: PermanentEmployee  e1 = new PermanentEmployee();
					System.out.println("Welcome you to School Marks Entry Portal");
					e1.setName();
					e1.setId();
					e1.setCompanyName();
					e1.setRate();
					e1.setEmployessTypes();
					e1.setWorkHour();
					e1.display();
					break;
			case 2: HourlyEmployee  e2 = new HourlyEmployee();
					System.out.println("Welcome you to School Marks Entry Portal");
					e2.setName();
					e2.setId();
					e2.setCompanyName();
					e2.setRate();
					e2.setEmployessTypes();
					e2.setWorkHour();
					e2.display();
					break;
					
			default : System.out.println("Wrong Input ");
		}
	}
	public static void main(String... args) 
	{
		choice();
	}
		

	
	

}