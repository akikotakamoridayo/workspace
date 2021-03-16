package ex04_04_04;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int i = new java.util.Random().nextInt(10);

		int j = 0;
		do {
			j = new java.util.Random().nextInt(10);
		} while (i == j);

		int k = 0;
		do {
			k = new java.util.Random().nextInt(10);
		} while (i == k || j == k);

		int l = 0;
		do {
			l = new java.util.Random().nextInt(10);
		} while (i == l || j == l || k == l);

		int m = 0;
		do {
			m = new java.util.Random().nextInt(10);
		} while (i == m || j == m || k == m || l == m);

		int[] numbers = { i, j, k, l, m };
		System.out.println("1桁の数字を入力してください");
		int input1 = new java.util.Scanner(System.in).nextInt();
		System.out.println("1桁の数字をもう一度入力してください");
		int input2 = new java.util.Scanner(System.in).nextInt();

		int ct = 0;
		for (int n : numbers)
			if (n == input1) {
				ct++;
			}
		for (int n2 : numbers)
			if (n2 == input2) {
				ct++;
			}

		if(ct==2) {
			System.out.println("全部アタリ！");
		}
		if(ct==1) {
			System.out.println("アタリ！");
		}
		if(ct==0) {
			System.out.println("はずれ");
		}
	}
}
