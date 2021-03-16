package ex04_04_14_1;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//		練習4-4①
		int[] numbers = new int[3];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = new java.util.Random().nextInt(10);
			for (int j = 0; j < i; j++) {
				while (numbers[j] == numbers[i]) {
					numbers[i] = new java.util.Random().nextInt(10);
				}
			}
		}

		System.out.println("1桁の数字を入力してください");
		int input=new java.util.Scanner(System.in).nextInt();
		for(int i=0;i<numbers.length;i++) {
			if(input==numbers[i]) {
				System.out.println("アタリ！");
			}
		}

	}
}
