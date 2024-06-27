package superkeyword;

public class SecondClass extends Superkeyexample {

	public SecondClass(){
		super();
		super.addition();
		System.out.println(super.s);//Invoked parent class variable using super
		System.out.println("Second Class Invoked");
		
	}
	public static void main(String[] args) {
		SecondClass obj= new SecondClass();
	}

}
