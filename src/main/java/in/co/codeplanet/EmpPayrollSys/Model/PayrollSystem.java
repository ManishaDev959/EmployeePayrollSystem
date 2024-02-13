package in.co.codeplanet.EmpPayrollSys.Model;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class PayrollSystem {
    private List<Employee> employeeList;

    public PayrollSystem() {
       employeeList=new ArrayList<>();
    }
    public void addEmployee(Employee employee)
    {
        employeeList.add(employee);
    }

   public void removeEmployee(int id)
   {
       Employee employeeTpRemove=null;
       for(Employee employee: employeeList){
           if(employee.getId()==id)
           {
               employeeTpRemove=employee;
           }
       }
       if(employeeTpRemove!=null)
       {
           employeeList.remove(employeeTpRemove);
       }
   }
   public void displayEmployees()
   {
       for(Employee employee:employeeList)
       {
           System.out.println(employee);
       }
   }


}
