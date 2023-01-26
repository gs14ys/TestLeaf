package week2.day2;

public class Assignment9 {

	public static int nonRepeating() {
		String s = "leetcode";
		char[] ch = s.toCharArray();
		int length = ch.length;
		for (int i = 0; i < length; i++) {
			for (int j = i + 1; j < length - 1; j++) {
				if (ch[i] == ch[j]) {
					continue;
				} else {

				}
			}
		}
		return 0;
	}

	public static void main(String[] args) {

	}
}
