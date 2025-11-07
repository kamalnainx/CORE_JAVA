package chapter03;

import java.lang.reflect.Field;

public class ProcessDetails<X> 
{

    private X emp;

    public ProcessDetails(X temp) 
    {
        emp = temp;
    }

    public void printResult() 
    {
        try 
        {
            Field idField = emp.getClass().getDeclaredField("empID");
            Field nameField = emp.getClass().getDeclaredField("empName");
            Field desgField = emp.getClass().getDeclaredField("empDesg");
            Field deptField = emp.getClass().getDeclaredField("empDept");
            Field salField = emp.getClass().getDeclaredField("empSal");
            Field amtField = emp.getClass().getDeclaredField("empSalAmt");

            Object idValue = idField.get(emp);
            Object nameValue = nameField.get(emp);
            Object desgValue = desgField.get(emp);
            Object deptValue = deptField.get(emp);
            Object salValue = salField.get(emp);
            Object amtValue = amtField.get(emp);
           
            System.out.println("=======================================");
            System.out.println("Following are the Employee Details\n");
            System.out.println("Employee ID:            " + idValue);
            System.out.println("Employee Name:          " + nameValue);
            System.out.println("Employee Designation:   " + desgValue);
            System.out.println("Employee Department:    " + deptValue);
            System.out.println("Employee Salary Type:   " + salValue);
            System.out.println("Employee Total Salary:  " + amtValue);

        } 
        catch (Exception ex) 
        {
            ex.printStackTrace();
        }
    }
}
