import java.util.*;

public class EmployeeWageComputation implements EmpWageInterface
{
	public static final int IS_FULL_TIME=1;
    public static final int IS_PART_TIME=2;
    public int n=0;
    public ArrayList<CompanyEmpWage> companyList;
    public HashMap<Integer,Integer> dailyWageMap;

    public EmployeeWageComputation()
    {
        companyList=new ArrayList<>();
    }

    public void addCompanyEmpWage(String COMPANY_NAME, int EMP_RATE_PER_HOUR, int NUM_OF_WORKING_DAYS, int MAX_WORK_HOURS)
    {
        CompanyEmpWage cobj=new CompanyEmpWage(COMPANY_NAME,EMP_RATE_PER_HOUR,NUM_OF_WORKING_DAYS,MAX_WORK_HOURS);
        dailyWageMap=new HashMap<Integer,Integer>();
        companyList.add(cobj);
        n++;
    }

    public void callCompute()
    {
        for(int i=0;i<companyList.size();i++)
        {
            CompanyEmpWage c=companyList.get(i);
            c.setTotalWage(computeWage(c));
            System.out.println(c);
        }
    }

	public int computeWage(CompanyEmpWage carray)
	{
        int empHrs=0,empWage=0,totalWage=0;
        int hours=0,days=1;

        while(hours<carray.MAX_WORK_HOURS && days<=carray.NUM_OF_WORKING_DAYS)
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

            empWage=empHrs*carray.EMP_RATE_PER_HOUR;
            dailyWageMap.put(days,empWage);
            //System.out.println("Daily Employee Wage: "+empWage);
            
            totalWage=totalWage+empWage;

            hours=hours+empHrs;
            days++;
        }

        for(HashMap.Entry m:dailyWageMap.entrySet())
        {
            System.out.println("Day "+m.getKey()+" wage: "+m.getValue());
        }

        System.out.println("Total Working Hours of "+carray.COMPANY_NAME+" : "+hours);
        System.out.println("Total working days of "+carray.COMPANY_NAME+" : "+(days-1)); /*As days get incremented after day completion hence -1, to determine total working days*/

        return totalWage;
    }
    
    public static void main(String[] args)
    {
        EmployeeWageComputation company=new EmployeeWageComputation();
        company.addCompanyEmpWage("Flipkart",500,25,200);
        company.addCompanyEmpWage("Amazon",600,20,250);
        company.callCompute();
    }
}