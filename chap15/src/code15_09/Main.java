package code15_09;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Hero hero = new Hero("髙森章子髙森章子髙森章子", "プログラマー", 10000);
		final String FOAMAT = "%-9s %-13s 所持金 %,6d";
		String s = String.format(FOAMAT, hero.getName(), hero.getJob(), hero.getGold());
		System.out.println(s);
	}

}
