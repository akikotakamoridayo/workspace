package ex20210225_01;

public class Ippan extends Car {
	public Ippan(int price) {
		super(price);
	}
	public void run(){
		System.out.println("普通に走る");
	}
	public void stop(){
		System.out.println("普通に停まる");
	}
}
