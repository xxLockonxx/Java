package test05;

public class CarFactory {
		private static CarFactory instance = new CarFactory();
		private CarFactory() {} //싱글톤이라서 외부에서 접근 못하게 해줘야 한다.
		
		public static CarFactory getInstance() {
			return instance;
		}
		
		public Car createCar(String name, int price) {
			return new Car(name, price);
		}
}
