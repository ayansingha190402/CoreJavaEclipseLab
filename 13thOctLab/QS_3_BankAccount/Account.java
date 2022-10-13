/* Program :Create a Account and perform synchronized 
withdrawal in it using Threads		
		
 
@Part - 1  - Account.java 
@author: Ayan Singha
@Date : 13 Oct 2022
@Lab Assesment by Shuruti Singhal Mam 
@Version: 1
*/
public class Account {
	private int balance = 50;
	public int getBalance() {
	return balance;
	}
	public void withdraw(int amount) {
	balance = balance - amount;
	}
}