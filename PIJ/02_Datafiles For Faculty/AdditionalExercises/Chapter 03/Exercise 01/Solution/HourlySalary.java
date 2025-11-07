package chapter03;

public class HourlySalary 
{
    public String empID, empName, empDesg, empDept, empSal;
    public int empSalAmt;

    public HourlySalary(String eID, String eName, String eDesg, String eDept, String eSal, int eSalAmt) 
    {
        empID = eID;
        empName = eName;
        empDesg = eDesg;
        empDept = eDept;
        empSal = eSal;
        empSalAmt = eSalAmt*100;

    }
}
