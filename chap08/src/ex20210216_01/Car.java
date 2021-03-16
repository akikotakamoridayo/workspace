package ex20210216_01;

public class Car {
	int fuel;
	int speed;

	public void accelarate(int kasoku) {
		this.speed += kasoku;
	}
	public int run(int hour) {
		int kyori=this.speed*hour;
		this.fuel-=kyori;
		return kyori;
	}
	public void stop() {
		this.speed=0;
		System.out.println("停止しました。");
	}
	public void showMeter() {
		System.out.println("現在の燃料は"+this.fuel+"㍑、時速は"+this.speed+"㌖/hです。");
	}
}
