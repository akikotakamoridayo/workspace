package ex20210130_07;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("パスワードを登録します");
		String password=new java.util.Scanner(System.in).nextLine();
		System.out.println("パスワードの確認をします");
		String kakuninn=new java.util.Scanner(System.in).nextLine();
		if(password.equals(kakuninn)) {
			System.out.println("登録しました");
		}else {
			System.out.println("パスワードが異なります");
		}

	}

}
