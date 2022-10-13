/* Program :Create a Account and perform synchronized 
withdrawal in it using Threads		
		
 
@Part - 2  - AccountWithdrawl.java 
@author: Ayan Singha
@Date : 13 Oct 2022
@Lab Assesment by Shuruti Singhal Mam 
@Version: 1
*/
public class AccountWithdrawl implements Runnable {
	private Account acct = new Account();
	public static void main(String[] args) {
		AccountWithdrawl r = new AccountWithdrawl();
		Thread one = new Thread(r);
		Thread two = new Thread(r);
		one.setName("Ranjeet");
		two.setName("Reema");
		one.start();
		two.start();
	}
	@Override
	public void run() {
		for (int x = 0; x < 5; x++) {
			makeWithdrawal(10);
			if (acct.getBalance() < 0) {
				System.out.println("account is overdrawn!");
			}
		}
	}
	private void makeWithdrawal(int amt) {
		if (acct.getBalance() >= amt) {
			System.out.println(Thread.currentThread().getName() + " is going to withdraw");
			try {
				Thread.sleep(100);
			} catch (InterruptedException ex) {
			}
			acct.withdraw(amt);
			System.out.println(Thread.currentThread().getName() + " completes the withdrawal");
		} else {
			System.out.println("Not enough in account for " + Thread.currentThread().getName() + " to withdraw " + acct.getBalance());
		}
	}
}