package ex15_15_09;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//①現在の日時をDate型で取得
		Date now = new Date();
		Calendar c = Calendar.getInstance();
		//②取得した日時情報をCalendarにセット
		c.setTime(now);
		//③Calendarから「日」の情報を取得
		int day=c.get(Calendar.DAY_OF_MONTH);
		//④100を足してCalendarにセット
		day+=100;
		c.set(Calendar.DAY_OF_MONTH, day);
		//Calendarの日時情報をDate型に変換する
		Date future=c.getTime();
		//SimpleDateFormatを用いて、Dateインスタンスの内容を表示
		SimpleDateFormat f = new SimpleDateFormat("西暦yyyy年MM月dd日");
		System.out.println(f.format(future));
	}

}
