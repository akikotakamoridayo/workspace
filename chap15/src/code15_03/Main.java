package code15_03;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String s1=" Java programming　";
		System.out.println("文字列s1の4文字目以降は"+s1.substring(3));
		System.out.println("文字列s1の4～8文字目以降は"+s1.substring(3,8));
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.trim());
		System.out.println(s1.replace("Java","VBA"));
	}

}
