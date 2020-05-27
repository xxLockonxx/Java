package sub2;

public class Student extends Person{

	
	private String school;
	private String major;
	
	public Student(String name, int age, String school, String major) {
		super(name, age);
		this.school = school;
		this.major = major;
	}
	
	public void hello() {
		super.hello(); //원친은 protected로 부모를 바꾸고 불러내는게 원칙
		System.out.println(school+"학생입니다.");
		System.out.println(major+"학생입니다.");
	}
	
}
