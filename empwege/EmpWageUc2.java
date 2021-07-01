package com.bridgelabz.empwege;

public class EmpWageUc2 {

	public static void main(String[] args) {
		int isFullTime = 1;
		int wagePerHour = 20;
		int dayHour = 0;
		double empCheck = Math.floor(Math.random() * 10) % 2;  // generate random number either 1 or 0
		if (empCheck == isFullTime){
			System.out.println("Employee Is Present for Full Time");
			dayHour = 8;
		}
		else {
			System.out.println("Employee Is Absent");
		}
		int dailyEmployeeWage = wagePerHour * dayHour;
		System.out.println("Daily Employee Wage is : "+dailyEmployeeWage);
	}

}
