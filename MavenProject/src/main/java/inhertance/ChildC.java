package inhertance;

public class ChildC extends ChildB{

	public void childcdisplay() {
		System.out.println("Child C class method invoked");
	}
	
	public static void main(String[] args) {
		ChildC obj=new ChildC();
		obj.displayparent();
		obj.childbdisplay();
		obj.childcdisplay();

	}

}
