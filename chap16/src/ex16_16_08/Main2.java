package ex16_16_08;

import java.util.HashMap;
import java.util.Map;

public class Main2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Hero h1 = new Hero("斎藤");
		Hero h2 = new Hero("鈴木");
		Map<Hero, Integer> heros = new HashMap<Hero, Integer>();
		heros.put(h1, 3);
		heros.put(h2, 7);
		for (Hero key : heros.keySet()) {
			int value=heros.get(key);
			System.out.println(key+"が倒した敵＝"+value);
		}
	}

}
