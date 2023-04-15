package lib;

import lib.EmployeeInfo.Nationality;

public class EmployeeSalary {
    private int monthlySalary;
    private int otherMonthlyIncome;
	

    private int annualDeductible;

    public EmployeeSalary(int monthlySalary, int otherMonthlyIncome, int annualDeductible) {
        this.monthlySalary = monthlySalary;
        this.otherMonthlyIncome = otherMonthlyIncome;
        this.annualDeductible = annualDeductible;
    }
    /**
	 * Fungsi untuk menentukan gaji bulanan pegawai berdasarkan grade kepegawaiannya (grade 1: 3.000.000 per bulan, grade 2: 5.000.000 per bulan, grade 3: 7.000.000 per bulan)
	 * Jika pegawai adalah warga negara asing gaji bulanan diperbesar sebanyak 50%
	 */

    public void setMonthlySalary(int grade) {
        switch (grade){
            case 1: monthlySalary = 3000000;
            case 2: monthlySalary = 5000000;
            case 3: monthlySalary = 7000000;
        }

        if(Nationality.FOREIGNER == EmployeeInfo.getNationality()){
            monthlySalary = (int) (monthlySalary * 1.5);
        }
    } 

    public void setAnnualDeductible(int annualDeductible) {
        this.annualDeductible = annualDeductible;
    }

    public void setAdditionalIncome(int otherMonthlyIncome) {
        this.otherMonthlyIncome = otherMonthlyIncome;
    }
}
