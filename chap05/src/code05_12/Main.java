package code05_12;

public class Main {
	public static void printArray(int[] array) {
		for (int element : array) {
			System.out.println(element);
		}
		array[0]=10;
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] array = { 1, 2, 3 };
		printArray(array);
		System.out.println(array[0]);
	}

}
