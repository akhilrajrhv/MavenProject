//Eg for simple inheritance

package inhertance;

public class Child extends Parent{//extends parent class
	
	public void substraction() {
		int sub;
		sub=a-b;
	System.out.println("The substraction result is:"+sub);
	}
	
	public static void main(String[] args) {
		Child obj=new Child();//create object for child class
		obj.addition();//invoke parent class method
		obj.substraction();//invoke child class method
		
	}

}
