/* Program :We have to calculate the area of a rectangle,
 a square and a circle. Create an abstract class 'Shape'
 with three abstract methods namely 'RectangleArea' taking 
 two parameters, 'SquareArea' and 'CircleArea' taking one parameter each. 
 The parameters of 'RectangleArea' are its length and breadth, that of
 'SquareArea' is its side and that of 'CircleArea' is its radius.
 Now create another class 'Area' containing all the three methods 
 'RectangleArea', 'SquareArea' and 'CircleArea' for printing the area of
 rectangle, square and circle respectively. Create an object of class 'Area'
 and call all the three methods.
 
 
@Part - 3 - Final.java 
@Date : 08 Oct 2022
@Lab Assesment by Shuruti Singhal Mam 
@Version: 1
*/

//importing Scanner class
import java.util.Scanner;

//define the class 
//Final
public class Final{
	
	//define the method area
	static void area()
	{
		//creating object for Area class
		Area area = new Area();
		
		//creating object for Scanner class
        Scanner sc = new Scanner(System.in);
		
		//--------------Rectangle-----------------
		//print
        System.out.println("\n\nRectangle --> ");
		System.out.println("Entrer length ::- ");
		//taking input for length
        double length = sc.nextDouble();
		//print
        System.out.println("Entrer breadth  :: -  ");
		//taking input for breadth
        double breadth = sc.nextDouble();
		//calling the method RectangleArea
		//with values length and breadth
        area.RectangleArea(length, breadth);
		
		//--------------------Square------------------------
		//print
		System.out.println("\n\nSquare --> ");
        System.out.println("Entrer length of side ::- ");
		//taking input for side
        double side = sc.nextDouble();
		//calling the method SquareArea
		//with values side
        area.SquareArea(side);
		
		//--------------------Circle------------------------
		//print
		System.out.println("\n\nCircle --> ");
        System.out.println("Entrer radius ::- ");
		//taking inpurt for radius
        double radius = sc.nextDouble();
		//calling the method CircleArea
		//with values radius
        area.CircleArea(radius);
	}//end of method area
	
	//defining main method 
    public static void main(String... args)
	{
		//calling the method area
		area();
        
    }//end of main method
}//end of final class