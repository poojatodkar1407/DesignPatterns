package com.bridgeit.Prototypepattern;
/**
 * Created By:Pooja Todkar.
 * Date :04/05/2019.
 * Purpose :implementation of Prototype Design pattern.
 * Description : provides the mechanism to copy the original object to new obj then 
 * modify according to our needs.
 */
import java.util.List;

public class employeeMain {
public static void main(String[] args) throws CloneNotSupportedException {
	
	Employee employee = new Employee();// oriiginal object
	
	employee.loadData();
	
	Employee emp1 = (Employee) employee.clone();//duplicate object
	Employee emp2 = (Employee) employee.clone();//duplicate object
	
	List<String> listEmp1 = emp1.getEmployee();// modifying object
	listEmp1.add("vinita");
	
	List<String> listEmp2 = emp2.getEmployee();
	listEmp2.remove("Pooja");
	//System.out.println(employee);
	System.out.println("1st object"+listEmp1);
	System.out.println("2nd object"+listEmp2);
}
}
