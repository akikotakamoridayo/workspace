package code17_02;

import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		try {
			FileWriter fw=new FileWriter("data.txt");
		}catch(IOException e) {
			System.out.println("エラーが発生しました。");
		}
	}

}
