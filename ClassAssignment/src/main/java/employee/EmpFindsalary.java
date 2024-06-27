package employee;

public class EmpFindsalary extends EmpSalaryDetails{
	double hra;
	double pf;
	
	public void findHraAndPf() { //find hra and pf
	hra=0.05 * basicpay;
	pf=0.20 * basicpay;
	//System.out.println("Employee HRA amount is"+hra);
	//System.out.println("Employee PF amount is"+pf);
	}

}
