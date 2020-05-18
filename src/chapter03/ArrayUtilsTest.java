package chapter03;

public class ArrayUtilsTest {

	public static void main(String[] args) {
		int[] a1 = { 10, 20, 30, 40 };
		double[] d1 = { 10.1, 20.2, 30.3, 40.3};
		
		double[] d2 = ArrayUtils.intToDouble(a1);
		for(double v : d2) {  //forEach
			System.out.println(v);
		}
		
		int[] a2 = ArrayUtils.doubleToInt(d1);
		for(int v : a2) {
			System.out.println(v);
		}
		
		int[] a3 = ArrayUtils.concat(a1, a2);
		for(int v : a3) {
			System.out.println(v);
		}		
	}

}
