package code15_07;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String s="abc,def:ghi";
		String[]words=s.split("[,:]");
		for(String w:words) {
			System.out.print(w+"->");
		}
	}

}
