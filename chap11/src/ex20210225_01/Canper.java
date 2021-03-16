package ex20210225_01;

public class Canper extends Car {
	public Canper(int price) {
		super(price);
	}

	public void run() {
		System.out.println("普通に走る");
	}

	public void stop() {
		System.out.println("普通に停まる");
	}

	public void canp() {
		System.out.println("ここをキャンプ地とする");
	}
}
