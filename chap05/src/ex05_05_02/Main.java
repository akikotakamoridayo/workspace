package ex05_05_02;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String title="招待状";
		String address="abcdefg";
		String text="ぜひおいでください";
		email(title,address,text);
//		email(address,text);
	}
	public static void email(String address,String text) {
		System.out.println(address+"に、以下のメールを送信しました");
		System.out.println("件名：無題");
		System.out.println("本文："+text);
	}
	public static void email(String title,String address,String text) {
		System.out.println(address+"に、以下のメールを送信しました");
		System.out.println("件名："+title);
		System.out.println("本文："+text);
	}
}
