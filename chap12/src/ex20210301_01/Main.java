package ex20210301_01;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Animal[] array = new Animal[3];
		array[0] = new Cat();
		array[1] = new Dog();
		array[2] = new Bird();
		for (Animal animal : array) {
			animal.naku();
		}
		PetHotel pt=new PetHotel();
		pt.service(array);
	}

}
