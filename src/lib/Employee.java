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
	
	public void setSpouse(String spouseName, String spouseIdNumber) {
		this.spouseName = spouseName;
		this.spouseIdNumber = idNumber;
	}
	
	public void addChild(String childName, String childIdNumber) {
		childNames.add(childName);
		childIdNumbers.add(childIdNumber);
	}
	
	public int getAnnualIncomeTax() {
		
		//Menghitung berapa lama pegawai bekerja dalam setahun ini, jika pegawai sudah bekerja dari tahun sebelumnya maka otomatis dianggap 12 bulan.
		LocalDate date = LocalDate.now();
		
		if (date.getYear() == yearJoined) {
			monthWorkingInYear = date.getMonthValue() - monthJoined;
		}else {
			monthWorkingInYear = 12;
		}
		
		return TaxFunction.calculateTax(monthlySalary, otherMonthlyIncome, monthWorkingInYear, annualDeductible, spouseIdNumber.equals(""), childIdNumbers.size());
	}
}
