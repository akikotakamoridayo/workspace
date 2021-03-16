package ex20210130_06;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int saikoro=new java.util.Random().nextInt(6);
		saikoro++;
		System.out.println("さいころの目を予想して入力してください");
		String nyuuryoku=new java.util.Scanner(System.in).nextLine();
		int suuzi=Integer.parseInt(nyuuryoku);
		if(saikoro==suuzi) {
			System.out.println("ビンゴ");
		}else {
			System.out.println("はずれ");
		}
	}

}
