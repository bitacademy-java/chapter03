package chapter03;

import person.Student;

public class WorkerStudent extends Student {
	
	public void test() {
		// protected는 자식 클래스에서만 접근 가능하다.
		name = "마이콜";
		
		// 부모의 private 필드는 자식에서 접근할 수 없다.(자식뿐만 아니라 코드어디에서도 접근할 수 없다.)
		//id = 10;
		
		// 부모의 public 필드는 자식에서 접근할 수 있다.(자식뿐만 아니라 코드어디에서든지 접근할 수 있다.)
		major = "영어영문학과";
		
		// 디폴트는 같은 패키지에서만 접근이 가능하다.
		// studentNumber = "950292-210101";
	}
}
