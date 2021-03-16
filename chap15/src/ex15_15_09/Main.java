package ex15_15_09;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 100; i++) {
			sb.append(i + 1).append(",");
		}
		System.out.println(sb);

		String s = sb.toString();
		String[] a = s.split(",");

		//		String path=concatPath("aaa","bbb");
		//		System.out.println(path);
		//		↓staticがないからクラスを作ってその中で使う！
	}

	public String concatPath(String folder, String file) {
		if (!folder.endsWith("\\")) {
			folder += "\\";
		}
		return folder + file;
	}
}