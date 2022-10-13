/* Program :Create a class Employee. Inherit 2 classes 
Hourly employeeand Salaried Employee  and functionality . Create a test class		
		
 
@Part - 2  - PermanentEmployee.java 
@author: Ayan Singha
@Date : 13 Oct 2022
@Lab Assesment by Shuruti Singhal Mam 
@Version: 1
*/
import java.util.Scanner;
public class PermanentEmployee extends EmployeeDatabase 
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
	public void setId() 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ID: -");
		int id=sc.nextInt();
		this.id = id;
	}
	
	@Override
	public void setCompanyName() 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter company name  : -");
		String cName =sc.nextLine();
		this.companyName = cName;
	}
	
	@Override
	public void setRate() 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter employess wages per hour : -");
		int rate=sc.nextInt();
		this.rate = rate;
	}
	
	@Override
	public void setEmployessTypes() 
	{
		this.employessTypes = "PERMANENT EMPLOYEE";
	}
	
	@Override
	public void setWorkHour() 
	{
		
		this.workHour = 8;
	}
	
	
	

}