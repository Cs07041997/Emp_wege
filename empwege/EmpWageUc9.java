package com.bridgelabz.empwege;

public class EmpWageUc9 {

	private static final int IS_FULL_TIME = 1;
	private static final int IS_PART_TIME = 2;
	private int wagePerHour; 
	private int monthlyWorkingDays;
	private int monthlyWorkingHours;
	private String companyName;
	
	   EmpWageUc9(String companyName, int monthlyWorkingHours, int monthlyWorkingDays, int wagePerHour) {
	        this.companyName = companyName;
	        this.monthlyWorkingHours = monthlyWorkingHours;
	        this.monthlyWorkingDays = monthlyWorkingDays;
	        this.wagePerHour = wagePerHour;
	}
	 public static void main(String[] args) {
	        
			// object for providing arguments to the method 
		 EmpWageUc9 empwage1 = new EmpWageUc9("sandhar", 100,20,20);
		 EmpWageUc9 empwage2 = new EmpWageUc9("ITC", 100,20,20);
			empwage1.getEmployeeWage();
			empwage2.getEmployeeWage();
		}

		// method to get employee's monthly wage
	void getEmployeeWage() {
		
		int dayHour = 0;
		int dailyEmployeeWage = 0;
		int monthlyWage = 0;
		int workingHours = 0;
		for (int i = 0; i < monthlyWorkingDays && workingHours < monthlyWorkingHours; i++) {
			double empCheck = Math.floor(Math.random() * 10) % 3;  // generate random number either 0,1 or 2
			switch ((int) empCheck) {
				case IS_FULL_TIME:
					dayHour = 8;
					break;
					
				case IS_PART_TIME:
					dayHour = 4;
					break;
					
				default:
					dayHour = 0;
			}
			dailyEmployeeWage = wagePerHour * dayHour;
			monthlyWage += dailyEmployeeWage;
			workingHours += dayHour; 
		}
		System.out.println("Monthly Employee Wage for Company "+ companyName+" is : "+monthlyWage);
		

	}

}
