package com.bridgeit.Prototypepattern;

/**
 * Created By:Pooja Todkar.
 * Date :04/05/2019.
 * Purpose :implementation of Prototype Design pattern.
 * Description : provides the mechanism to copy the original object to new obj then 
 * modify according to our needs.
 */
import java.util.ArrayList;
import java.util.List;

public class Employee implements Cloneable {

	private List<String> employee;

	public Employee() {
		employee = new ArrayList<String>();// cretaing the arraylist of employee
	}

	public Employee(List<String> employee) {
		// super();
		this.employee = employee;
	}

	public void loadData()// adding the data into employee
	{
		employee.add("Pooja");
		employee.add("arti");
		employee.add("prasad");
	}

	public List<String> getEmployee() {
		return employee;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		List<String> temp = new ArrayList<String>();

		for (String s : this.getEmployee()) {
			temp.add(s);
		}
		return new Employee(temp);
	}

}
