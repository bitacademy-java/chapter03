package paint;

public class Circle extends Shape {
	private int x1;
	private int y1;
	private int radius;
	
	@Override
	public void draw() {
		System.out.println("원을 그렸습니다.");
	}

}
