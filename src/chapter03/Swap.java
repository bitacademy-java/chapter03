package chapter03;

public class Swap {

	public static void main(String[] args) {
		int i = 10;
		int j = 20;
		
		System.out.println(i + ":" + j);
		swap(i, j);
		System.out.println(i + ":" + j);
		
		System.out.println("======================");
		
		Value i2 = new Value();
		i2.setVal(10);
		Value j2 = new Value();
		j2.setVal(20);
		
		System.out.println(i2.getVal() + ":" + j2.getVal());
		swap(i2, j2);
		System.out.println(i2.getVal() + ":" + j2.getVal());
		
	}

	public static void swap(int m, int n) {
		int temp = m;
		m = n;
		n = temp;
	}
	
	public static void swap(Value m, Value n) {
		int temp = m.getVal();
		m.setVal(n.getVal());
		n.setVal(temp);
	}
	
}
