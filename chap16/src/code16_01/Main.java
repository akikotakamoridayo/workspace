package code16_01;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		ArrayList<Integer>points=new ArrayList<>();
		points.add(10);
		points.add(80);
		points.set(1,75);
		for(int i:points) {
			System.out.println(i);
		}
	}

}
