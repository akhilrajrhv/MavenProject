package hierarchical;

public class ChildClassB extends ParentClass{

	public void childb() {
		System.out.println("Child B Class Invoked!!");
	}
	public static void main(String[] args) {
		ChildClassB obj=new ChildClassB();
		obj.parent();
		obj.childb();

	}

}
