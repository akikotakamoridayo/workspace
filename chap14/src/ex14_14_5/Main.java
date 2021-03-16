package ex14_14_5;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Account a = new Account();
		a.accountNumber = "4649";
		a.balance = 1592;
		System.out.println(a);
		Account b = new Account();
		b.accountNumber = " 4649";
		if (a.equals(b)) {
			System.out.println("同じ口座です");
		} else {
			System.out.println("違う口座です");
		}
	}

}
