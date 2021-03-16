package ex20210225_01;

public class TyuugataTruck extends Truck {
	public TyuugataTruck(int price) {
		super(price);
	}

	public void run() {
		System.out.println("ゴトゴト走る");
	}

	public void stop() {
		System.out.println("ゴトゴト停まる");
	}

	public void load() {
		System.out.println("荷物をぼちぼち積む");
	}
}
