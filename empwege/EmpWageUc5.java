package com.bridgelabz.empwege;

public class EmpWageUc5 {

	public static void main(String[] args) {
		final int IS_FULL_TIME = 1;
		final int IS_PART_TIME = 2;
		final int WAGE_PER_HOUR = 20;
		final int MONTHLY_WORKING_DAYS = 20;
		int dayHour = 0;
		int dailyEmployeeWage = 0;
		int monthlyWage = 0;
		for (int i = 0; i < MONTHLY_WORKING_DAYS; i++) {
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
			dailyEmployeeWage = WAGE_PER_HOUR * dayHour;
			monthlyWage += dailyEmployeeWage;
		}
		System.out.println("Monthly Employee Wage is : "+monthlyWage);

	}

}
