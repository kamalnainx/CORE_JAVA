package chapter03;

public class MonthlySalary 
{
    public String empID, empName, empDesg, empDept, empSal;
    public int empSalAmt;

    public MonthlySalary(String eID, String eName, String eDesg, String eDept, String eSal, int eSalAmt) 
    {
        empID = eID;
        empName = eName;
        empDesg = eDesg;
        empDept = eDept;
        empSal = eSal;
        empSalAmt = eSalAmt*10000;
    }
}
