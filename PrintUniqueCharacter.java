package week3.assignments;

import java.util.HashSet;
import java.util.Set;

public class PrintUniqueCharacter {
	public static void main(String[] args) {

		String text = "babu";
		char[] charArray = text.toCharArray();
		Set<Character> charSet = new HashSet<Character>();
		for (int i = 0; i < charArray.length; i++) {

			if (charSet.add(charArray[i]) == false) {
				charSet.remove(charArray[i]);
			} else {
				charSet.add(charArray[i]);
			}
		}
		System.out.println(charSet);
	}

}
