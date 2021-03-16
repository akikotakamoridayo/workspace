package code10_01;

public class Hero {
	String name = "ミナト";
	int hp = 100;
	public Hero() {
		System.out.println("Heroのコンストラクタが動作");
	}

	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃");
		m.hp -= 10;
		System.out.println("10ポイントのダメージをあたえた！");
	}

	public void run() {
		System.out.println(this.name + "は逃げ出した！");
	}
}
