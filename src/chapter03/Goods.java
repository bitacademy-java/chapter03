package chapter03;

public class Goods {
	private static int countOfInstance = 0;
	
	private String name;
	private int price;
	private int countStock;
	private int countSold;
	
	public Goods() {
		// 생성자와 인스탄스 메소드에서는 클래스(static) 변수는 클래스 이름으로 접근해야 한다.
		// 하지만 같은 클래스 안에서는 생략이 가능하다.
		countOfInstance++;	
	}
	
	public static int getCountOfInstance() {
		// 클래스 이름(Goods)는 static method 안에서는 생략 할수 있다.   
		//return Goods.countOfInstance;
		return countOfInstance;
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		if(price < 0) { // 정보보호
			price = 0;
		}
		this.price = price;
	}
	public int getCountStock() {
		return countStock;
	}
	public void setCountStock(int countStock) {
		this.countStock = countStock;
	}
	public int getCountSold() {
		return countSold;
	}
	public void setCountSold(int countSold) {
		this.countSold = countSold;
	}
	
	public void showInfo() {
		System.out.println( name + ":" + price + ":" + countSold + ":" + countStock );
	}

	public int calculateDiscountPrice(double discountRate) {
		return (int)(price * discountRate / 100.);
	}
	
}