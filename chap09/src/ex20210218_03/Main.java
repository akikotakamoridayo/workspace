package ex20210218_03;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Burger cheese=new Burger();
		cheese.setBurgerName("チーズバーガー");
		cheese.setCal(550);
		cheese.setcost(150);
		Burger lettuce=new Burger();
		lettuce.setBurgerName("レタスバーガー");
		lettuce.setCal(340);
		lettuce.setcost(80);
		System.out.print("二個食べた時のカロリーは");
		System.out.print(cheese.getCal()+lettuce.getCal());
	}

}
