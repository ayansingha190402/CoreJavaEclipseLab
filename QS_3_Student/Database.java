/* Program :Create a Class student which is inherited by college and school student . 
Override the method calculate average marks.	
 
@Part - 1 - Database.java 
@author: Ayan Singha
@Date : 08 Oct 2022
@Lab Assesment by Shuruti Singhal Mam 
@Version: 1
*/

import java.util.Scanner;
public class Database {


	protected int rollNo;
	protected String name;
	protected int noOfSubject;
	//String name;

	public Database() 
	{
		super();
		
	}

	public Database( int rollNo , String name, int noOfSubject) 
	{
		super();
		
		this.rollNo = rollNo;
		this.name = name;
		this.noOfSubject = noOfSubject;
	}
	

	
	public int getRollNo() 
	{
		return rollNo;
	}

	public void setRollNo() 
	{
		this.rollNo = 0000;
	}

	public String getName() 
	{
		return name;
	}

	public void setName() 
	{
		this.name = "DEMO";
	}

	public int getNoOfSubject() 
	{
		return noOfSubject;
	}

	public void setNoOfSubject() 
	{
		this.noOfSubject = 0;
	}
	
	public double calculateAverage()
	{
		Scanner sc=new Scanner(System.in);
		int marks[] = new int[noOfSubject];
		int totalMarks=0;
		System.out.println("Enter marks : -");
		for(int i=0;i<=noOfSubject-1;i++)
		{
				System.out.println("Enter marks "+(i+1)+ " : -");
				marks[i]=sc.nextInt();
				totalMarks+=marks[i];
				
		}
		double averageMarks =(double)(totalMarks/noOfSubject);
		return averageMarks;
	}
	
	public int display()
	{
		
		double average=calculateAverage();
		System.out.println("Roll No:-->"+ rollNo);
		System.out.println("Name:-->"+ name);
		System.out.println("Total no of subject:-->"+ noOfSubject);
		System.out.println("Average marks:-->"+ average);
		return 0;
		
	}
	
	
	@Override
	public String toString() {
		return "Database[rollNo=" + rollNo + ", name=" + name + ", noOfSubject="
				+ noOfSubject + "]";
	}

}