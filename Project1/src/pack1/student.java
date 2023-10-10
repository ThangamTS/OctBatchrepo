package pack1;

public class student {

	int rollNo;
	int age;
	
	public void display1() {
		System.out.println("Welcome to all of you \n");
		}
	public void display2() {
		System.out.println("Automation is very Easy \n");
		}

	public static void main(String[] args) {
		student d1 = new student();
		d1.display1();
		d1.display2();
		d1.rollNo = 1000;
		d1.age =25;
		System.out.println("Student1 roll No is :" + d1.rollNo + " and Age is :" + d1.age  );
	
	}

}
