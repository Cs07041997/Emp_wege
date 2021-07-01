package com.bridgelabz.empwege;

public class EmpWageUc4 {

	public static void main(String[] args) {
		final int IS_FULL_TIME = 1;
		final int IS_PART_TIME = 2;
		final int WAGE_PER_HOUR = 20;
		int dayHour = 0;
		double empCheck = Math.floor(Math.random() * 10) % 3;  // generate random number either 0,1 or 2
		switch ((int) empCheck) {
			case IS_FULL_TIME:
				System.out.println("Employee is Present for Full Time");
				dayHour = 8;
				break;
				
			case IS_PART_TIME:
				System.out.println("Employee is Present for Part Time");
				dayHour = 4;
				break;
				
			default:
				System.out.println("Employee is Absent");
		}
		
		int dailyEmployeeWage = WAGE_PER_HOUR * dayHour;
		System.out.println("Daily Employee Wage is : "+dailyEmployeeWage);
	}

}
