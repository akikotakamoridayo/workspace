package ex20210225_01;

public class KogataTruck extends Truck {
	public KogataTruck(int price) {
		super(price);
	}

	public void run() {
		System.out.println("普通に走る");
	}

	public void stop() {
		System.out.println("普通に停まる");
	}

	public void load() {
		System.out.println("荷物をやや積む");
	}
}
