/* Program : Compare string builder and string Buffer using performance test		
 @author: Ayan Singha
@Date : 06th Oct 2022
@Lab Assesment by Shuruti Singhal Mam 
@Version: 1
*/

//define tha package
package com.performance;

//declaring the class PerformanceTest
public class PerformanceTets {

	//declaring the method test
	static void test() {
		
		//declaring varieble for start time
		long startTime = System.currentTimeMillis();  
		
		//creating object of StringBuffer class 
        StringBuffer sb = new StringBuffer("Java is Easy");  
        
        //starting of for loop
        //for calculate time taken for append method
        for (int i=0; i<1000000; i++){  
            sb.append("Tpoint");  
        }  //end of for 
        
        //printing
        System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");  
        
        //redining the varieable for current time
        startTime = System.currentTimeMillis();  
        
        //creating object for StringBuilder class
        StringBuilder sb2 = new StringBuilder("Java");  
        
      //starting of for loop
        //for calculate time taken for append method
        for (int i=0; i<1000000; i++){  
            sb2.append("Tpoint");  
        }  //end of for
        
        //printing
        System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - startTime) + "ms");  
	}// end of test method
	
	//declaring the main method 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//calling the method test
		test();

	}//end of main method 

}//end of class PerformanceTest
