package ex05_05_04;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		double bottom = 5;
		double height = 3;
		System.out.println("三角形の面積は" + calcTriangleArea(bottom, height) + "㎠");

		double radius = 5;
		System.out.println("円の面積は"+calcCircleArea(radius)+"㎠");
	}



	public static double calcTriangleArea(double bottom, double height) {
		return bottom * height / 2;
	}

	public static double calcCircleArea(double radius) {
		return radius * radius * 3.14;
	}
}
