package employee;

public class Salaryslip extends EmpFindsalary{
	
	double salary;
	
	public void displaySalary() {//method used for disaply salary slip
		
		salary=basicpay+hra-pf-deduction+bonus;//calculate inhand salary
		System.out.println("DETAILED SALARY SLIP!!!!!!!!!!!!");
		System.out.println("Employee Basic Pay Amount is:"+basicpay);
		System.out.println("Employee Deduction Amount is:"+deduction);
		System.out.println("Employee HRA Amount is:"+hra);
		System.out.println("Employee PF Amount is:"+pf);
		System.out.println("Employee Bonus Amount is:"+bonus);
		System.out.println("Total Salary Inhand Amount is:"+salary);
	}

	public static void main(String[] args) {
		Salaryslip obj=new Salaryslip();
		obj.getEmpSalary();
		obj.findHraAndPf();
		obj.displaySalary();
	}

}
