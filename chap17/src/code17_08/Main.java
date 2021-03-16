package code17_08;

import java.io.FileWriter;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		FileWriter fw = null;
		try {
			fw = new FileWriter("data.txt");
			fw.write("hello!");
		} catch (Exception e) {
			System.out.println("何らかの例外が発生しました。");
		} finally {
			if (fw != null) {
				try {
					fw.close();
				} catch (Exception e) {
				}
			}
		}
	}

}
