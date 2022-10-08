/* Program :Create a Class student which is inherited by college and school student . 
Override the method calculate average marks.	
 
@Part - 4  - Final.java 
@author: Ayan Singha
@Date : 08 Oct 2022
@Lab Assesment by Shuruti Singhal Mam 
@Version: 1
*/
import java.util.Scanner;
public class Final
 {

	public static void choice() 
	{

		System.out.println("Welcome you to marks entry portals ");
		System.out.println("PRESS 1 for School Student ");
		System.out.println("PRESS 2 for College Student ");
		System.out.println("Enter your choice ");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		switch(choice)
		{
			case 1: SchoolStudent student1 = new SchoolStudent();
					System.out.println("Welcome you to School Marks Entry Portal");
					student1.setName();
					student1.setRollNo();
					student1.setNoOfSubject();
					student1.display();
					break;
			case 2: CollegeStudent student2 = new CollegeStudent();
					System.out.println("Welcome you to college Marks Entry Portal");
					student2.setName();
					student2.setRollNo();
					student2.setNoOfSubject();
					student2.display();
					break;
			default : System.out.println("Wrong Input ");
		}
	}
	public static void main(String... args) 
	{
		choice();
	}
		

	
	

}