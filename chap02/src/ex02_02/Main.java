package ex02_02;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int money=20000;
		int wine=3500;
		int num=money/wine;
		int leftOver=money-wine*num;
		System.out.println(num+"本の購入が可能");
		System.out.println("所持金は"+leftOver+"余る");
	}

}
