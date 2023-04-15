package lib;

public class TaxFunction {
	public static int calculateTax(int monthlySalary, int otherMonthlyIncome, int numberOfMonthWorking, int deductible, boolean isMarried, int numberOfChildren) {
		
		int taxableIncome = (monthlySalary + otherMonthlyIncome) * numberOfMonthWorking - deductible;

		int tax = (int) Math.round(0.05 * (taxableIncome - getDeductible(isMarried, numberOfChildren)));
		if (tax < 0) {
			return 0;
		} else {
			return tax;
		}
	}
	private static int getDeductible(boolean isMarried, int numberOfChildren) {
		int deductible = 54000000;
		if(isMarried){
			deductible += 4500000;
		}
		if(numberOfChildren > 0){
			deductible += 4500000 * Math.min(numberOfChildren, 3);
		}
		return deductible;
	}
}
