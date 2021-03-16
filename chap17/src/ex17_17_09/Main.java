package ex17_17_09;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		try {
			String s = null;
			System.out.println(s.length());
		} catch (NullPointerException c) {
			System.out.println("ーースタックトレース(ここから)ーー");
			c.printStackTrace();
			System.out.println("ーースタックトレース(ここまで)ーー");
		}
	}

}
