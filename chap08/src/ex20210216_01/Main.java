package ex20210216_01;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Car march=new Car();
		march.fuel=560;
		march.speed=60;

		march.accelarate(30);
		int kyori=march.run(3);
		System.out.println(kyori+"㌖走りました。");
		march.stop();
		march.showMeter();
	}

}
