package ex15_15_09;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		LocalDate now=LocalDate.now();
		LocalDate future=now.plusDays(100);
		DateTimeFormatter fmt=DateTimeFormatter.ofPattern("西暦yyyy年MM月dd日");
		System.out.println(future.format(fmt));
	}

}
