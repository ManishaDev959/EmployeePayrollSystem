package in.co.codeplanet.EmpPayrollSys;

import in.co.codeplanet.EmpPayrollSys.Model.FullTimeEmployee;
import in.co.codeplanet.EmpPayrollSys.Model.PartTimeEmployee;
import in.co.codeplanet.EmpPayrollSys.Model.PayrollSystem;

import java.sql.SQLOutput;

public class Main {
    public static void main(String...args)
    {
        PayrollSystem payrollSystem=new PayrollSystem();
        FullTimeEmployee fullTimeEmployee1=new FullTimeEmployee("Manisha",1,70000);
        PartTimeEmployee partTimeEmployee1=new PartTimeEmployee("Vivek",2,5,500);
        payrollSystem.addEmployee(fullTimeEmployee1);
        payrollSystem.addEmployee(partTimeEmployee1);
        System.out.println("Initial employee details");
        payrollSystem.displayEmployees();
        System.out.println("Remove employees");
        payrollSystem.removeEmployee(2);
        System.out.println("remaining employees ");
        payrollSystem.displayEmployees();
    }

}
