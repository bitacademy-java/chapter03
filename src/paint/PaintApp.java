package paint;

public class PaintApp {

	public static void main(String[] args) {
		Point point1 = new Point();
		point1.setX(10);
		point1.setY(20);
		//drawPoint(point1);
		draw(point1);
		
		//point1.disappear();
		point1.show(false);
		
		Point point2 = new Point(100, 200);
		//drawPoint(point2);
		draw(point2);
		
		// Point point3 = new ColorPoint();
		ColorPoint colorPoint = new ColorPoint();
		Point point3 = colorPoint; // Upcasting은 암시적이다. 
		
		point3.setX(30);
		point3.setY(100);
		ColorPoint colorPoint2 = (ColorPoint)point3; // Downcasting은 명시적이다. 
		colorPoint2.setColor("red");
		//drawPoint(point3);
		draw(point3);
		
		point3.show(false);
		point3.show(true);
		
		Point point4 = new ColorPoint(50, 100, "blue");
		//drawPoint(point4);
		draw(point4);
		
		//=====================================
		Shape shape1 = new Triangle();
		//drawTriangle(triangle);
		draw(shape1);
		
		Shape shape2 = new Rectangle();
		draw(shape2);
		
		draw(new Circle());
		
		//=====================================
		draw(new GraphicString("Hello"));
		
		
		// instanceof 클래스
		// 상속관계만 연산 할 수 있다.
		Shape s = new Rectangle();
		
		System.out.println( s instanceof Object);
		System.out.println( s instanceof Shape);
		System.out.println( s instanceof Rectangle);
		System.out.println( s instanceof Triangle);
		
		
		Rectangle r = new Rectangle();
		System.out.println( r instanceof Object);
		System.out.println( r instanceof Shape);
		System.out.println( r instanceof Rectangle);
		// System.out.println( r instanceof Triangle);
		
	}

	private static void draw(Drawable d) {
		d.draw();
	}

//	private static void drawPoint(Point point) {
//		point.show();
//	}
	
//	private static void drawColorPoint(ColorPoint point) {
//		point.show();
//	}

//	private static void draw(Shape shape) {
//		shape.draw();
//	}
	
//	private static void drawTriangle(Triangle triangle) {
//		triangle.draw();
//	}
//
//	private static void drawRectangle(Rectangle rectangle) {
//		rectangle.draw();
//	}
	
}
