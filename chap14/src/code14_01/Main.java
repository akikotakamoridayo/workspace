package code14_01;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Empty e=new Empty();
		String s=e.toString();
		System.out.println(s);
		System.out.println(e);

		Hero h=new Hero();
		h.name="ミナト";
		h.hp=100;
		System.out.println(h.toString());
	}

}
