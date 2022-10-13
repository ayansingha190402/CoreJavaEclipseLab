/* Program Create a Thread using Lambda .	
@author: Ayan Singha
@Date : 13 Oct 2022
@Lab Assesment by Shuruti Singhal Mam 
@Version: 1
*/
public class RunnableLambdaThread {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + " class: Runnable Test ##Lambda");
 
        // Anonymous Runnable
 
        Runnable task1 = new Runnable(){
 
          @Override
          public void run(){
            System.out.println(Thread.currentThread().getName() + " is starting  ");
          }
        };
		
		Thread thread1 = new Thread(task1, "..... It is without lambda");
		System.out.println(" -->>>  Without lambda............ ");
        thread1.start();
		
		
 
 
        // Passing a Runnable when creating a new thread
		
		 Runnable task2 = () -> {
            System.out.println(Thread.currentThread().getName() + " is still running ");
        };
 
        Thread thread2 = new Thread(task2,"...... It is with lambda");
		System.out.println(Thread.currentThread().getName() + "  -->>>  With lambda............");
		thread2.start();
 
        // Lambda Runnable
        Runnable task3 = () -> {
            System.out.println(Thread.currentThread().getName() + " .........is running\n\nLambda Runnable ");
        };
 
        
 
        new Thread(task3).start();
		
		
 
    }
	
	
}