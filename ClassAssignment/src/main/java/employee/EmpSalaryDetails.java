package employee;

import java.util.Scanner;

public class EmpSalaryDetails {
	double basicpay;
	double deduction;
	double bonus;

	public void getEmpSalary() { //get employee salary details from console
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Please Enter Employee Basic Pay Amount:");
		basicpay=sc.nextDouble();
		System.out.println("Please Enter Employee Dedcution Amount:");
		deduction=sc.nextDouble();
		System.out.println("Please Enter Employee Bonus Amount:");
		bonus=sc.nextDouble();
}
}
