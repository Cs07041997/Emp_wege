package com.bridgelabz.empwege;

public class EmpWageUc8 {

	final int IS_FULL_TIME = 1;
	final int IS_PART_TIME = 2;
	static int wagePerHour;
	static int monthlyWorkingDays;
	static int monthlyWorkingHours;
	static String companyName;
	
	        EmpWageUc8(String companyName, int monthlyWorkingHours, int monthlyWorkingDays, int wagePerHour) {
	        EmpWageUc8.companyName = companyName;
	        EmpWageUc8.monthlyWorkingHours = monthlyWorkingHours;
	        EmpWageUc8.monthlyWorkingDays = monthlyWorkingDays;
	        EmpWageUc8.wagePerHour = wagePerHour;
	}

		// method to get employee's monthly wage
	void getEmployeeWage(String companyName,int monthlyWorkingHours,int monthlyWorkingDays,int wagePerHour) {
		
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
	public static void main(String[] args) {
        
		// object for providing arguments to the method 
		EmpWageUc8 empwage = new EmpWageUc8(companyName,monthlyWorkingHours,monthlyWorkingDays,wagePerHour);
		empwage.getEmployeeWage("Jay", 100,20,20);
		empwage.getEmployeeWage("Kumar", 100,20,20);
	}
		

	

}
