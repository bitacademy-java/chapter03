package chapter03;

public class GoodsApp {

	public static void main(String[] args) {
		Goods camera = new Goods();
		
		camera.setName("Nikon");
		camera.setPrice(250000);
		camera.setCountSold(100);
		camera.setCountStock(50);

		Goods goods1 = new Goods();
		Goods goods2 = new Goods();

		camera.showInfo();
		int discountPrice = camera.calculateDiscountPrice(20.5);
		goods1.showInfo();
		goods2.showInfo();
		
		System.out.println(Goods.getCountOfInstance());
		System.out.println(discountPrice);
	}

}
