package ex20210129_1;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int maru=new java.util.Random().nextInt(6);
		int sannkaku=new java.util.Random().nextInt(6);
		maru++;
		sannkaku++;
		int dai=Math.max(maru, sannkaku);
		System.out.println(maru+"と"+sannkaku+"は、"+dai+"の方が大きいので、"+dai+"の勝ち");
	}

}
