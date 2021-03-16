package code04_10;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] scores = { 20, 30, 40, 50, 80 };
		int sum = scores[0];
		int ma=scores[0];
		int mi=scores[0];
		int mul=scores[0];
		for (int i = 1; i < scores.length; i++) {
			sum += scores[i];
			ma=Math.max(ma,scores[i]);
			mi=Math.min(mi,scores[i]);
			mul*=scores[i];
		}

		int avg=sum/scores.length;
		System.out.println("合計点:"+sum);
		System.out.println("平均点:"+avg);
		System.out.println("最大値:"+ma);
		System.out.println("最小値:"+mi);
		System.out.println("積:"+mul);
	}
}
