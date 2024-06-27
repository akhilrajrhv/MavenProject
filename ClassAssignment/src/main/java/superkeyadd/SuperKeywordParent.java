package superkeyadd;

import java.util.Scanner;

public class SuperKeywordParent {
	int num1,num2,sum;

	public void getnumbers() {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter two numbers:");
		num1 =sc.nextInt();
		num2 =sc.nextInt();
		
	}
	public void addition() {
		sum=num1+num2;
		System.out.println("Sum of two numbers is:"+sum);
		
	}
}
