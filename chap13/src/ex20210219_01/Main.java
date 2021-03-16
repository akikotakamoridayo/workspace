package ex20210219_01;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Goods apple=new Goods("りんご");
		apple.price=238;
		Goods milk=new Goods("牛乳");
		milk.price=178;
		Goods cornflakes=new Goods("コーンフレーク");
		cornflakes.price=298;
		System.out.println("■■購入商品■■");
		System.out.println(apple.getGoodsName()+apple.price+"円");
		System.out.println(milk.getGoodsName()+milk.price+"円");
		System.out.println(cornflakes.getGoodsName()+cornflakes.price+"円");
	}

}
