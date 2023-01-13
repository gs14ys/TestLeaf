package week1.day2;

public class findPalindromFromSentence {

	public static void main(String[] args) {
		System.out.println(" is it a palindrom: " + findPalindromFromSentence.findPalindrom(" "));

	}

	public static boolean findPalindrom(String str) {

		str = str.toLowerCase();
		String revString = "";
		boolean finalConclusion = false;
		String regexStr = str.replaceAll("\\W", "");
		char[] charString = regexStr.toCharArray();
		for (int i = charString.length - 1; i >= 0; i--) {
			revString = revString + charString[i];
		}
		if (revString.equals(regexStr)) {
			finalConclusion = true;
		} else {
			finalConclusion = false;
		}

		return finalConclusion;
	}
}
