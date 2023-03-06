import java.lang.*;
import java.io.*;
import java.util.*;

public class Rectangle extends Shape
{
	float l;
	float b;
	public double perimeter()
	{
		double p = 2*(l + b);
		return p;
	}
	
	public double area()
	{
		double a = l*b;
		return a;
	}
	
	public Rectangle(float length, float breadth)
	{
		l = length;
		b = breadth;
	}
	
	public Rectangle()
	{}
}