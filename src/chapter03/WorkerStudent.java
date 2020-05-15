package chapter03;

import person.Student;

public class WorkerStudent extends Student {
	public void test() {
		// protected는 자식 클래스에서 접근 가능하다.
		name = "마이콜";
	}
}
