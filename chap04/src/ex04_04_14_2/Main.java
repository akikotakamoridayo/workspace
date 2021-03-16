package ex04_04_14_2;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] numbers = new int[5];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = new java.util.Random().nextInt(10);
			for (int j = 0; j < i; j++) {
				while (numbers[j] == numbers[i]) {
					numbers[i] = new java.util.Random().nextInt(10);
				}
			}
		}
		int count = 0;
		for (int i = 0; i < 2; i++) {
			System.out.println("1桁の数字を入力してください");
			int input = new java.util.Scanner(System.in).nextInt();
			for (int number : numbers) {
				if (input == number) {
					count++;
				}
			}
		}
		switch (count) {
		case 1:
			System.out.println("アタリ！");
			break;
		case 2:
			System.out.println("全部アタリ！");
			break;
		case 0:
			System.out.println("はずれ");
			break;

		}
	}
}
