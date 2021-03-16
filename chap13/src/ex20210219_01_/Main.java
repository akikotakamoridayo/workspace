package ex20210219_01_;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Goods g1=new Goods("ブラックサンダー");
		g1.setGoodsPrice(30);
		Goods g2=new Goods("よっちゃんイカ");
		g2.setGoodsPrice(20);
		Goods g3=new Goods("うまい棒");
		g3.setGoodsPrice(10);
		Register regi=new Register();
		regi.okaiage(g1, g2, g3);
	}

}
