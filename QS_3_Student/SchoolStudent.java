/* Program :Create a Class student which is inherited by college and school student . 
Override the method calculate average marks.	
 
@Part - 3 - SchoolStudent.java 
@author: Ayan Singha
@Date : 08 Oct 2022
@Lab Assesment by Shuruti Singhal Mam 
@Version: 1
*/
import java.util.Scanner;
public class SchoolStudent extends Database 
 {
	

	@Override
	public void setName() 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name : -");
		String stName=sc.nextLine();
		this.name = stName;
	}
	
	@Override
	public void setRollNo() 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Roll no : -");
		int roll=sc.nextInt();
		this.rollNo = roll;
	}
	
	@Override
	public void setNoOfSubject() 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter total no subject : -");
		int subject =sc.nextInt();
		this.noOfSubject = subject;
	}
	
	
	

}