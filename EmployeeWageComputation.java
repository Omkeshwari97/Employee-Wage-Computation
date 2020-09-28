import java.util.*;

public class EmployeeWageComputation
{
	public static final int IS_FULL_TIME=1;
    public static final int IS_PART_TIME=2;
    
    private final String COMPANY_NAME;
    private final int EMP_RATE_PER_HOUR;
    private final int NUM_OF_WORKING_DAYS;
    private final int MAX_WORK_HOURS;

    public EmployeeWageComputation(String COMPANY_NAME, int EMP_RATE_PER_HOUR, int NUM_OF_WORKING_DAYS, int MAX_WORK_HOURS)
    {
        this.COMPANY_NAME=COMPANY_NAME;
        this.EMP_RATE_PER_HOUR=EMP_RATE_PER_HOUR;
        this.NUM_OF_WORKING_DAYS=NUM_OF_WORKING_DAYS;
        this.MAX_WORK_HOURS=MAX_WORK_HOURS;
    }

	public int computeWage()
	{
        int empHrs=0,empWage=0,totalWage=0;
        int hours=0,days=1;

        while(hours<=MAX_WORK_HOURS && days<=NUM_OF_WORKING_DAYS)
        {   
            int empCheck=1 + (int)(Math.random() * ((2- 1) + 1));
            //System.out.println(empCheck);
            
            switch(empCheck)
            {
                case IS_FULL_TIME:  empHrs=8;
                                    break;	
                case IS_PART_TIME:  empHrs=4;
                                    break;
                        default:    empHrs=0;
            }

            empWage=empHrs*EMP_RATE_PER_HOUR;
            System.out.println("Daily Employee Wage: "+empWage);
            
            totalWage=totalWage+empWage;

            hours=hours+empHrs;
            days++;
        }

        System.out.println("Total Working Hours of "+COMPANY_NAME+" : "+hours);
        System.out.println("Total working days of "+COMPANY_NAME+" : "+(days-1)); /*As days get incremented after day completion hence -1, to determine total working days*/

        return totalWage;
    }
    
    public static void main(String[] args)
    {
        EmployeeWageComputation c1=new EmployeeWageComputation("Flipkart",500,25,200);
        EmployeeWageComputation c2=new EmployeeWageComputation("Amazon",600,20,250);

        System.out.println("Total Wage of Flipkart: "+c1.computeWage());
        System.out.println("Total Wage of Amazon : "+c2.computeWage());
    }
}