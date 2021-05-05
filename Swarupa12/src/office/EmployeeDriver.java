/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package office;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;



/**
 *
 * @author Swarupa Pedapalli
 */
public class EmployeeDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Swarupa Pedapalli");
        ArrayList<Employee> emp = new ArrayList<Employee>();
        emp.add(new Employee(9, "tom", 6023.23));
	emp.add(new Employee(23, "Jerry",8034.34));
	emp.add(new Employee(42, "kid",3534.345));
	emp.add(new Employee(11, "ranger",9993.48));
	emp.add(new Employee(64, "swa",2000.54));
       System.out.println("Students in original order:");
		for(Employee s : emp)
		{
			System.out.println(s);
		}
		System.out.println();
		
		// Sort the employees into natural order by emp id
		Collections.sort(emp);
		System.out.println("Sorting by emp id: ");
		for(Employee s : emp)
		{
			System.out.println(s);
		}
		System.out.println();
		
		
		Collections.sort(emp, new Comparator<Employee>()
      		{
                @Override
		public int compare(Employee a, Employee x)
		{
		if(a.getEmpSalary() < x.getEmpSalary())
			return -1;
		else if (a.getEmpSalary() == x.getEmpSalary())
		return 0;
		else
		return +1;
		}
      		});
		System.out.println("Employees in increasing order by Salary:");
		for(Employee s2 : emp)
		{
			System.out.println(s2);
		}
		System.out.println();
		
	
		Collections.sort(emp, new Comparator<Employee>()
      		{
                        @Override
			public int compare(Employee s1, Employee s2)
			{
			
			return (s1.getEmployeeName()).compareTo(s2.getEmployeeName());
                        }	
      		});
		System.out.println("Employees in order by name: ");
		for(Employee s3 : emp)
		{
			System.out.println(s3);
		}
		System.out.println();


	}

}