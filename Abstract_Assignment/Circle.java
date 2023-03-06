import java.lang.*;
import java.io.*;
import java.util.*;

public class Circle extends Shape
{
	private float r;
	public double perimeter()
	{
		double circum = 2*Math.PI*r;
		return circum;
	}
	
	public double area()
	{
		double a = Math.PI*r*r;
		return a;
	}
	
	public Circle(float radius)
	{
		r = radius;
	}
	
	public Circle()
	{}
}