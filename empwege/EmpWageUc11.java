package com.bridgelabz.empwege;

public class EmpWageUc11 {

	public int wagePerHour; 
	public int monthlyWorkingDays;
	public int monthlyWorkingHours;
	public String companyName;
	public int totalWage;
	
	EmpWageUc11(String companyName, int monthlyWorkingHours, int monthlyWorkingDays, int wagePerHour) {
	        this.companyName = companyName;
	        this.monthlyWorkingHours = monthlyWorkingHours;
	        this.monthlyWorkingDays = monthlyWorkingDays;
	        this.wagePerHour = wagePerHour;
	}
	
	EmpWageUc11(){}
	 
	 public void setTotalWage(int totalWage) {
	        this.totalWage = totalWage;
	    }
	 
	 @Override
	    public String toString() {
	        return "Monthly Wage for Company " + companyName + " is : " + totalWage;

	}

}
