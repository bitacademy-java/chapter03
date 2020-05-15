package chapter03;

import person.Student;

public class Studenttest {

	public static void main(String[] args) {
		Student s = new Student();
		
		// private은 외부에서 접근 X
		// s.id = 1;
		
		// protected는 같은 패키지에서 접근
		// protected는 같은 자식에서 접근이 가능
		// s.name = "둘리";
		
		// default는 같은 패키지에서(만) 접근
		// s.studentNumber = "019020-0202";
		
		// public는 어디서든 접근 가능(접근하지 않음)
		s.major = "computer science";
		

	}

}
