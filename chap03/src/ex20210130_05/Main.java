package ex20210130_05;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int m=new java.util.Random().nextInt(6);
		int s=new java.util.Random().nextInt(6);
		if(m==s) {
			System.out.println("引き分け");
		}else {
		m++;
		s++;
		int a=Math.max(m, s);
		System.out.println(m+"と"+s+"は、"+a+"の方が大きいので、"+a+"の勝ち");
	}}

}
