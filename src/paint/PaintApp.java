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
		
		Point point3 = new ColorPoint();
		point3.setX(30);
		point3.setY(100);
		((ColorPoint)point3).setColor("red");
		drawPoint(point3);
		
		point3.show(false);
		point3.show(true);
	}

	private static void drawPoint(Point point) {
		point.show();
	}
	
//	private static void drawColorPoint(ColorPoint point) {
//		point.show();
//	}
	
}
