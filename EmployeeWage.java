public class EmployeeWage{
	// Constants
	static final int IS_FULL_TIME = 2;
	static final int IS_PART_TIME = 1;
	static final int EMP_RATE_PER_HOUR =20;
	static final int WORKING_DAYS_PER_MONTH=20;
	static final int Total_WORKING_Hours=100;

	public void EmpWageBuilder(){

		int empHrs = 0;
		int empWage = 0;
		int salary=0,total_salary=0;
		int total_Working_Days=0,total_Working_Hours=0;
		// Computation
		while( total_Working_Days <= WORKING_DAYS_PER_MONTH && total_Working_Hours <= Total_WORKING_Hours ){
		total_Working_Days++;

		int empCheck = (int)(Math.random() * 10) % 3;
		switch (empCheck){
		case IS_FULL_TIME:
			empHrs=8;
			break;
		case IS_PART_TIME:
			empHrs=4;
			break;
		default:
			empHrs=0;
			break;
		}
		total_Working_Hours = empHrs + total_Working_Hours;
		total_salary=total_Working_Hours*EMP_RATE_PER_HOUR;
	}
		System.out.println("Emp Wage: " + total_salary);
  }
	public static void main(String[] args){
		EmployeeWage emp1=new EmployeeWage();
		emp1.EmpWageBuilder();
	}
}
