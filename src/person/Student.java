package person;

public class Student extends Person{
	private int id;
	protected String name;
	String studentNumber;
	public String major;
	
	public Student() {
		// 자식 생성자에서 부모 생성자 중에 하나라도 명시하지 않으면
		// 자동으로 부모의 기본 생성자를 호출한다.
		// 그리고 반드시 자식 생성자의 실행코드가 시작되기 전에 호출된다.
		// super();
		System.out.println("Student() Called");
	}
}
