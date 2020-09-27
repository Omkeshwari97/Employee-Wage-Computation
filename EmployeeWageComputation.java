import java.util.*;

public class EmployeeWageComputation
{
	public static final int IS_FULL_TIME=1;
    public static final int IS_PART_TIME=2;
	public static final int EMP_RATE_PER_HOUR=20;

	public static void main(String args[])
	{
		int empHrs=0,empWage=0;

		int empCheck=(int)Math.floor(Math.random()+15)%3;
		System.out.println(empCheck);
		
		if(empCheck==IS_FULL_TIME)
            empHrs=8;	
        else if(empCheck==IS_PART_TIME)
            empHrs=4;
		else
			empHrs=0;

		empWage=empHrs*EMP_RATE_PER_HOUR;

		System.out.println("Daily Employee Wage: "+empWage);
	}
}