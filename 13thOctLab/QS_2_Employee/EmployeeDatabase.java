/* Program :Create a class Employee. Inherit 2 classes 
Hourly employeeand Salaried Employee  and functionality . Create a test class		
		
 
@Part - 1  - EmployeeDatabase.java 
@author: Ayan Singha
@Date : 13 Oct 2022
@Lab Assesment by Shuruti Singhal Mam 
@Version: 1
*/

import java.util.Scanner;
public class EmployeeDatabase {


	protected int id;
	protected String name;
	protected String companyName;
	protected int salary;
	protected int rate;
	protected String employessTypes;
	protected int workHour;
	
	
	//String name;

	public EmployeeDatabase() 
	{
		super();
		
	}

	public EmployeeDatabase( int id , String name,String companyName,  int  salary, int rate, String employessTypes, int workHour) 
	{
		super();
		
		this.id = id;
		this.name = name;
		this.companyName = companyName;
		this.salary = salary;
		this.rate = rate;
		this.employessTypes=employessTypes;
		this.workHour= workHour;
	}
	

	
	public int getId() 
	{
		return id;
	}

	public void setId() 
	{
		this.id = 0000;
	}

	public String getName() 
	{
		return name;
	}

	public void setName() 
	{
		this.name = "DEMO";
	}

	public String getCompanyName() 
	{
		return companyName;
	}

	public void setCompanyName() 
	{
		this.companyName = "DEMO";
	}
	public int getSalary() 
	{
		return salary;
	}

	public void setSalary() 
	{
		this.salary = 0;
	}
	
	public int getRate() 
	{
		return rate;
	}

	public void setRate() 
	{
		this.rate = 0000;
	}
	
	
	public String getEmployessTypes() 
	{
		return employessTypes;
	}

	public void setEmployessTypes() 
	{
		this.employessTypes = "DEMO";
	}
	public int getWorkHour() 
	{
		return workHour;
	}

	public void setWorkHour() 
	{
		this.workHour = 0000;
	}

	public int  calculateSalary()
	{
		salary = rate*workHour;
		return salary;
	}
	
	
	public void display()
	{
		
		System.out.println(" EMPLOYEE ID:-->"+ id);
		System.out.println("EMPLOYEE NAME:-->"+ name);
		System.out.println("COMPANY NAME:-->"+ companyName);
		System.out.println("EMPLOYESS TYPES:-->"+ employessTypes);
		System.out.println("EMPLOYESS TOTAL WROK HOUR:-->"+ workHour);
		System.out.println("SALARY RATE :-->"+ rate+"INR PER Hour");
		System.out.println("EMPLOYEE NET  SALARY:-->"+ calculateSalary());
		
		
	}
	
	
	/*@Override
	public String toString() {
		return "Database[id=" + id + ", name=" + name + ", companyName="
				+ companyName + "]";
	}*/

}