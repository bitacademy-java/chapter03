package chapter03;

public class StaticMethod {
	int n;
	static int m;
	
	void f1() {
		// 인스탄스 메소드에서 인스턴스 변수 접근 O
		n = 1;
	}
	
	void f2() {
		// 인스탄스 메소드에서 클래스(static)변수 접근 O
        // StaticMethod.m = 2 원칙, 단 같은 클래스에서는 클래스 이름은 생략 가능
		m = 2;
	}

	void f3() {
		// 인스탄스 메소드에서 클래스(static)변수 접근 O
        // StaticMethod.s1() 원칙, 단 같은 클래스에서는 클래스 이름은 생략 가능
		s1();
	}

	static void s1() {
		// error: 클래스(static) 메소드에서 인스턴스 변수 접근 X
		// n = 1;
	}

	static void s2() {
		// 클래스(static) 메소드에서 클래스(static) 변수 접근  O
		m = 1;
	}

	static void s3() {
		// error: 클래스(static) 메소드에서 인스턴스 메소드 접근 X
		// f1();
		// 클래스(static) 메소드에서 클래스(static) 메소드 접근 O
		s1();
	}
	
}
