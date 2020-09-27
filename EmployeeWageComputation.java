import java.util.*;

public class EmployeeWageComputation
{
	public static final int IS_FULL_TIME=1;

	public static void main(String args[])
	{
		double empCheck=Math.floor(Math.random()+15)%2;
		//System.out.println(empCheck);
		if(empCheck==IS_FULL_TIME)
			System.out.println("Employee is Present");
		else
			System.out.println("Employee is Absent");
	}
}