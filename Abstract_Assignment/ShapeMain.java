import java.lang.*;
import java.io.*;
import java.util.*;

public class ShapeMain
{
	public static void main(String args[])
	{
		Shape c = new Circle(5);
		Shape r = new Rectangle(3.2f,4.8f);
		System.out.println("Circumference of the Circle : "+c.perimeter());
		System.out.println("\nArea of the Circle : "+c.area());
		System.out.println("\nPerimeter of the Rectangle : "+r.perimeter());
		System.out.println("\nArea of the Rectangle : "+r.area());
	}
}