package ex20210225_01;

public class Kei extends Car {
	public Kei(int price) {
		super(price);
	}

	public void run() {
		System.out.println("燃費良く走る");
	}

	public void stop() {
		System.out.println("燃費良く停まる");
	}
}
