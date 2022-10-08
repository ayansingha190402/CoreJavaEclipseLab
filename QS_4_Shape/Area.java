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
 
 
@Part - 2 - Area.java - defining the methods  - for calculate are
@author: Ayan Singha
@Date : 08 Oct 2022
@Lab Assesment by Shuruti Singhal Mam 
@Version: 1
*/

//declaring the class 
// Area 
//extending the abstract class Shape
//method overriding 
public class Area extends Shape{

    //define a final value for pi
	//value can`t be change through out the code
	final double pi=3.14;
	
	//method overide
	//defining the method RectangleArea
	//with parameter length and width
	@Override
    public void RectangleArea(double lenght, double width) 
	{
		//calculating the area
		double area=(lenght*width);
		
		//print
        System.out.println("Rectangle area = "+area);
        
		
    }//end of method RectangleArea
	
	//method overide
	//defining the method SquareArea
	//with parameter side
    @Override
    public void SquareArea(double side) 
	{
		//calculating the area
		double area=(side * side);
		
		//print
        System.out.println("Square area = "+ area);
        
    }//end of method SquareArea
	
	//method overide
	//defining the method CircleArea
	//with parameter radius
	@Override
    public void CircleArea(double radius) 
	{
		//calculating the area 
		double area=(pi*(radius*radius));
		
		//print
        System.out.println("Circle area = "+ area);
       
    }//end of method CircleArea
}//end of class Area