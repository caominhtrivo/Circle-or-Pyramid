package tri_lab12;
import java.util.Scanner;
import java.lang.Math;
public class Circle_or_Pyramid {
	public static void Calculate_circle(double radius)
	{
		double area, circumference;
		area = radius * Math.PI * radius;
		circumference = 2 * Math.PI * radius;
		System.out.println("Area = "+ area);
		System.out.println("Circumference = "+circumference);
	}
	public static void Calculate_pyramid(double length, double width, double height)
	{
		double base = length * width;
		double volume = base * height / 3 ;
		System.out.println("Base = "+base);
		System.out.println("Volume = "+ volume);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int a;
			Scanner scnr = new Scanner(System.in);
			System.out.print("Type 0 for Circle or type 1 for Pyramid: ");
			a = scnr.nextInt();
			if(a==0) 
			{
				System.out.print("Type your radius: ");
				double radius = scnr.nextDouble();
				Calculate_circle(radius);
			}
			else if (a==1)
			{
				System.out.print("Type your length: ");
				double length = scnr.nextDouble();
				System.out.print("Type your width: ");
				double width = scnr.nextDouble();
				System.out.print("Type your height: ");
				double height= scnr.nextDouble();
				Calculate_pyramid(length, width, height);
				
			}
	}

}
