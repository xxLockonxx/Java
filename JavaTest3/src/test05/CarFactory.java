package test05;

public class CarFactory {
		private static CarFactory instance = new CarFactory();
		private CarFactory() {} //�̱����̶� �ܺο��� ���� ���ϰ� ����� �Ѵ�.
		
		public static CarFactory getInstance() {
			return instance;
		}
		
		public Car createCar(String name, int price) {
			return new Car(name, price);
		}
}
