package com.bridgelabz.empwege;

public class EmpWageUc1 {

	public static void main(String[] args) {
		int isPresent = 1;
		double empCheck = Math.floor(Math.random() * 10) % 2;  // generate random number either 1 or 0
		if (empCheck == isPresent){
			System.out.println("Employee Is Present");
		}
		else {
			System.out.println("Employee Is Absent");
		}

	}

}
