package paint;

public class PaintApp {

	public static void main(String[] args) {
		Point point1 = new Point();
		point1.setX(10);
		point1.setY(20);
		drawPoint(point1);
		//point1.disappear();
		point1.show(false);
		
		Point point2 = new Point(100, 200);
		drawPoint(point2);
		
		
		
	}

	private static void drawPoint(Point point) {
		point.show();
	}
}
