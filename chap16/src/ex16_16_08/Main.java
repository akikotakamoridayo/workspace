package ex16_16_08;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Hero h1=new Hero("斎藤");
		Hero h2=new Hero("鈴木");
		ArrayList<Hero>heros=new ArrayList<Hero>();
		heros.add(h1);
		heros.add(h2);
		for(Hero h:heros) {
			System.out.println(h.getName());
		}
	}

}
