import java.util.Scanner;

public class Rectangles{
	public static void main(String [] args){
		double width, height, perimeter, area;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("input width of rectangle:");
		width=keyboard.nextDouble();
		System.out.println("enter height of rectangle:");
		height=keyboard.nextDouble();
		perimeter=2*height+2*width;
		area=height*width;
		System.out.println("The rectangle's area is "+area+" and its perimeter is "+perimeter);
	}
}																			
