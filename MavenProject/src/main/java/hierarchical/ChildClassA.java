package hierarchical;

public class ChildClassA extends ParentClass{
	
	public void childa() {
		System.out.println("Child A Class Invoked!!");
	}
	
	public static void main(String[] args) {
	ChildClassA obj=new ChildClassA();
	obj.parent();
	obj.childa();
	}

}
