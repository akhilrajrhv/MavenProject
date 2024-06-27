package superkeyadd;

public class SuperKeywordChild extends SuperKeywordParent{
	
	int sumresult,di;
	
	public SuperKeywordChild() {
	super.getnumbers();
	super.addition();
	sumresult=super.sum;
	
	if(sumresult%10==0) {
	System.out.println("The given number is divisible by 10");
	}
	else {
	System.out.println("The given number is not divisible by 10");
	}
		
	}

	public static void main(String[] args) {
	SuperKeywordChild obj=new SuperKeywordChild();

	}

}
