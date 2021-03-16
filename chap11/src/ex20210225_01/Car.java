package ex20210225_01;

public abstract class Car {
	String name;
	int price;
	int fuel;

	public Car(int price) {
		if (price <= 100000) {
			throw new IllegalArgumentException("価格を10万円より高く設定してください");

		}
	}

	public abstract void run();

	public abstract void stop();
}
