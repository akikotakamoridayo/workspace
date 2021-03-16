package java03_01;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		for (int i = 0; i <10; i++) {
			for (int j = 0; j < 10-i; j++) {
				System.out.print(" " );
			}
			for (int j = 0; j <=i; j++) {
				System.out.print("*" );
			}
			for (int j = 0; j <=i; j++) {
				System.out.print("*" );
			}
			System.out.println("");
		}
	}

}
