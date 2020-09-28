import java.util.*;

public class EmployeeWageComputation
{
	public static final int IS_FULL_TIME=1;
    public static final int IS_PART_TIME=2;
    //public static final int EMP_RATE_PER_HOUR=20;
    //public static final int NUM_OF_WORKING_DAYS=20;
    //public static final int MAX_WORK_HOURS=100;

	public static void computeWage(String COMPANY_NAME, int EMP_RATE_PER_HOUR, int NUM_OF_WORKING_DAYS, int MAX_WORK_HOURS)
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

        System.out.println("Total Wage of "+COMPANY_NAME+" : "+totalWage);
        System.out.println("Total Working Hours of "+COMPANY_NAME+" : "+hours);
        System.out.println("Total working days of "+COMPANY_NAME+" : "+(days-1)); /*As days get incremented after day completion hence -1, to determine total working days*/
    }
    
    public static void main(String[] args)
    {
        computeWage("Flipkart",500,25,200);
        computeWage("Amazon",600,20,250);
    }
}