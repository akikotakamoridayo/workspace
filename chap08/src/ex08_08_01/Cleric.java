package ex08_08_01;

import java.util.Random;

public class Cleric {
	String name;
	public static final int MAX_HP=50;
	public static final int MAX_MP=10;
	int hp=MAX_HP;
	int mp=MAX_MP;

	public void selfAid() {
		System.out.println(this.name+"はセルフエイドを唱えた！");
		this.hp=MAX_HP;
		this.mp-=5;
		System.out.println("HPが最大まで回復した");
	}

	public int pray(int sec) {
		System.out.println(this.name+"は"+sec+"秒間天に祈った！");
		int recover=new Random().nextInt(3)+sec;
		int recoverActual=Math.min(this.MAX_MP-this.mp,recover);
		this.mp+=recoverActual;
		System.out.println("MPが"+recoverActual+"ポイント回復した");
		return recoverActual;
	}
	public int pray2(int sec) {
		System.out.println(this.name+"は"+sec+"秒間天に祈った！");
		int recoverActual2;
		int recover2=new Random().nextInt(3)+sec;
		if(this.mp+recover2>this.MAX_MP) {
			recoverActual2=this.MAX_MP-this.mp;
		}else {
			recoverActual2=recover2;
		}
		this.mp+=recoverActual2;
		System.out.println("MPが"+recoverActual2+"ポイント回復した");
		return recoverActual2;
	}
}

