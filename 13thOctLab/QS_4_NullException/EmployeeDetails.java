/* Program  Create a cutom exception (Name cannot be null). The user will enter student details , it will throw an exception if the name or id id null
@author: Ayan Singha
@Date : 13 Oct 2022
@Lab Assesment by Shuruti Singhal Mam 
@Version: 1
*/
import java.util.Scanner;
public class EmployeeDetails extends Exception 
 {
	
	
	public static void inputName() 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name : -");
		String name=sc.nextLine();
		if(name == null || name.isEmpty())
		{
			try {
			throw new Exception("Name can not be blank..................");
			} catch (Exception e1) {
			e1.printStackTrace();
			System.exit(0);
			}
		}
		else
			System.out.println("NAME:-->");
			System.out.println(name);
		
	}
	
	public static void inputRollNo() 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Roll No : -");
		String rollNo=sc.nextLine();
		if(rollNo == null || rollNo.isEmpty())
		{
			try {
			throw new Exception("Roll No can not be blank..................");
			} catch (Exception e2) {
			e2.printStackTrace();
			System.exit(0);
			}
		}
		else
			System.out.println("ROLL NO:-->");
			System.out.println(rollNo);
	}
	
	public static void inputStandard() 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter class : -");
		String standard=sc.nextLine();
		if(standard == null || standard.isEmpty())
		{
			try {
			throw new Exception("Class ncan not be blank..................");
			} catch (Exception e3) {
			e3.printStackTrace();
			System.exit(0);
			}
		}
		else
			System.out.println("CLASS:-->");
			System.out.println(standard);
	}
	
	public static void display()
	{
		
		inputName();
		inputRollNo();
		inputStandard();
		
		
	
		
		
	}
	
	public static void main(String... args) 
	{
		
		display();
		
	}
	
	
	
	
	
	

}