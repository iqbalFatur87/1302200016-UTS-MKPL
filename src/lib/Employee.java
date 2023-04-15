package lib;

import java.time.LocalDate;
import java.time.Month;
import java.util.LinkedList;
import java.util.List;

public class Employee {

	private EmployeeInfo employeeInfo;
	private EmployeeDate employeeDate;
	private EmployeeSalary employeeSalary;
	private SpouseInfo spouseInfo;
	private ChildInfo childInfo;

	public Employee(EmployeeInfo employeeInfo, EmployeeDate employeeDate, EmployeeSalary employeeSalary, SpouseInfo spouseInfo, ChildInfo childInfo) {
		this.employeeInfo = employeeInfo;
		this.employeeDate = employeeDate;
		this.employeeSalary = employeeSalary;
		this.spouseInfo = spouseInfo;
		this.childInfo = childInfo;
	}
	
}
