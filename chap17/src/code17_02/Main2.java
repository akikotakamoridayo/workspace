package code17_02;

import java.io.FileWriter;

public class Main2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		try {
			FileWriter fw = new FileWriter("data.txt");
			fw.write("hello!");
			fw.close();
		} catch (Exception e) {
			System.out.println("何らかの例外が発生しました。");
		}
	}

}
