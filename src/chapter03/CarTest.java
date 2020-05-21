package chapter03;

public class CarTest {

	public static void main(String[] args) {
		Car car = new Car();
		
		Drivable drivable = car;
		drivable.accelerate();
		drivable.steer();
		
		Breakble breakble = car;
		breakble.stop();
	}

}
