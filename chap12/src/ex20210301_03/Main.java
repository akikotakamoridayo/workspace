package ex20210301_03;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Burger[] b = new Burger[3];
		b[0] = new CheeseBurger(600);
		b[1] = new TeriyakiBurger(650);
		b[2] = new RiceBurger(550);

		int total = 0;
		for (Burger bg : b) {
			total += bg.getCal();
		}
		System.out.println("これらのカロリーの合計は" + total + "です。");

	}

}
