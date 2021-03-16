package ex08_08_01;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Cleric c=new Cleric();
		c.name="プニプニ";
		c.hp=50;
		System.out.println("聖職者"+c.name+"を生み出しました！");
		c.selfAid();
		c.pray2(10);
	}

}
