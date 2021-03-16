package ex20210130_04;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int m=4;
		int k=200000;
		while(m<=8) {

			if(!(m==6)) {
				System.out.println(m+"月の給料日：所持金\\"+(k));
			}else {
				System.out.println(m+"月の給料日：所持金\\0やってもうた；");
				k=0;
			}
			k+=50000;
			m++;
		}


	}}
