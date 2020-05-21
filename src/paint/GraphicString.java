package paint;

public class GraphicString implements Drawable {
	private String text;
	
	public GraphicString(String text) {
		this.text = text;
	}
	
	@Override
	public void draw() {
		System.out.println( "\"" + text + "\"" + "를 그렸습니다.");
	}

}
