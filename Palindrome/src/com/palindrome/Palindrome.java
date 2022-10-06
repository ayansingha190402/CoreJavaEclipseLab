/* Program :Write a code to check a string is palindrome or not	
@author: Ayan Singha
@Date : 06th  Oct 2022
@Lab Assesment by Shuruti Singhal Mam 
@Version: 1
*/

//defining package 
package com.palindrome;

// importing scanner class 
import java.util.Scanner;

//creating class Palindrome
public class Palindrome {
	
	// creating the method checkPalindrome  with parameter s1
	public static void checkingPalindrome(String s1) {
	
	//declaring varieables for use 
	boolean checkConstant;
	String reverseString = "";

	//for loop
	//for creating reverse string of user input string
	for (int i = (s1.length() - 1); i >= 0; i--) {
		//storing each character of user input string
		//with a sequence of last to fast
		reverseString += s1.charAt(i);
	}//end of for

	//using compareto method under Java String class
	//for checking whether reverseString==userInputString
	//if  true it will set the default value i.e., 1
	int flag =( s1.compareTo(reverseString));
	
	/*//if the user input string is a palindrome
	//the value of gloabal boolean varieable 
	//eill be equal to true
	if (flag  == 0)
		checkConstant= true;
	else //else false
		checkConstant = false;*/
	
	//calling the method diplay
	//and passing values - s1,reversestrString,checkConstant
	display(s1,reverseString,flag);
}// end of class checkingPalinmdrome
	
	//decalring the method deisplay
	//with parament word, reverse, checkConstant
	//to display the result
	static void display(String word, String reverse, int flag) {
		//printing
		System.out.println("String you Entered :-->  "+ word);
		System.out.println("Reverse of String you Entered :-->  "+ reverse+"\n Hence");
		
		//ifcheckConstant==true
		if (flag==0 ) {
			System.out.println("------>>>The string is apalindrome....................");

		}
		else //else
		{
			System.out.println("------>>>The string is  not a  palindrome...................");
		}
		
	}//end of method 
	
	//defining main method
	public static void main(String... args) {
		// TODO Auto-generated method stub
		//creating object for scanner class
		Scanner sc = new Scanner(System.in);
		
		//taking user input a string
		System.out.println("Enter a String:");
		String word = sc.next();
		
		//calling the method checkingPalindrom
		//with passing value word
		 checkingPalindrome(word);
	
		sc.close(); // closing scanner 
	}//end of main method

}//end of palindrome class

