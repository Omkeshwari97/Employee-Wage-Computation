
public class CompanyEmpWage
{
    public final String COMPANY_NAME;
    public final int EMP_RATE_PER_HOUR;
    public final int NUM_OF_WORKING_DAYS;
    public final int MAX_WORK_HOURS;
    public int totalWage;

    public CompanyEmpWage(String COMPANY_NAME, int EMP_RATE_PER_HOUR, int NUM_OF_WORKING_DAYS, int MAX_WORK_HOURS)
    {
        this.COMPANY_NAME=COMPANY_NAME;
        this.EMP_RATE_PER_HOUR=EMP_RATE_PER_HOUR;
        this.NUM_OF_WORKING_DAYS=NUM_OF_WORKING_DAYS;
        this.MAX_WORK_HOURS=MAX_WORK_HOURS;
    }

    public void setTotalWage(int totalWage)
    {
        this.totalWage=totalWage;
    }

    public int getTotalWage()
    {
        return totalWage;
    }

   /*@Override
    public String toString()
    {
        return ("Total Wage of "+COMPANY_NAME+" :"+totalWage);
    }*/
}