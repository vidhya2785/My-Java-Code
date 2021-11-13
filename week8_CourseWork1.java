package java_week8;
import java.util.Scanner;

public class week8_CourseWork1 
{
	public static void main (String[] args) 
	{
		Scanner emp= new Scanner(System.in);
		System.out.println("Enter salary for an Employee:"); //new object
		int sal= emp.nextInt();
		System.out.println("SALARY="+sal);
		System.out.println("Calculating DA of an Empolyee " +sal);
		double val=emp.nextDouble();
		val=0.1;
		double DA= sal*val;
		System.out.println("DA for this Employee:" +DA);
		System.out.println("Calculating HRA of an Empolyee " +sal);
		double val1=emp.nextDouble();
		val1=0.05;
		double HRA= sal*val1;
		System.out.println("HRA for this Employee:" +HRA);
		double val2=emp.nextDouble();
		val2=0.13;
		double tax= sal*val2;
		System.out.println("Tax for this Employee:" +tax);
	    double GrossSal=DA+HRA+tax;
	    System.out.println("Gross salary for this Employee:" +GrossSal);
	    
		
	}
	

}

