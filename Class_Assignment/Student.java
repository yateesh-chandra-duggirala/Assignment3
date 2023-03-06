package Student_details;

import java.lang.*;
import java.io.*;
import java.util.*;


public class Student 
{

private int rollNumber;
private String name, course;
private float[] marks;

public float calculateTotal()
{

float total = 0;
for (float i:marks)
	total+=i;
return total;

}

public float calculateAverage()
{

float avg = calculateTotal()/3 ;
return avg;

}

public String calculateGrade()
{

float avg = calculateAverage();
String grade = avg>90 ? "A+" : avg>80 ? "A" : avg>60 ? "B" : avg>35 ? "D" : "F";
return grade;

}

public void setRollNumber(int rollNumber)
{

this.rollNumber = rollNumber;

}

public int getRollNumber()
{
return rollNumber;
}

public void setName(String name)
{

this.name = name;

}

public String getName()
{

return name;

}

public void setCourse(String course)
{

this.course = course;

}

public String getCourse()
{

return course;

}

public void setMarks(float[] marks)
{

this.marks = marks;

}

public float[] getMarks()
{

return marks;

}

public String toString()
{

return "Student details:\nRoll Number = "+rollNumber+" \nName = "+name+"\nCourse = "+course+"\nMarks = "+Arrays.toString(marks)+"\nTotal = "+calculateTotal()+"\nAverage = "+calculateAverage()+"\nGrade = "+calculateGrade();

}
}