package code11_17;

public class Fool extends Character implements Human,Runnable {
	@Override
	public void attack(Matango m) {
		System.out.println(this.name + "は戦わず遊んでいる");
	}

	@Override
	public void talk() {
	}

	@Override
	public void watch() {
	}

	@Override
	public void hear() {
	}

	@Override
	public void run() {
	}
}
