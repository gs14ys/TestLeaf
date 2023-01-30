package week3.assignments;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String text = "PayPal India";
		char[] charArray = text.toCharArray();
		Set<Character> charSet = new HashSet<Character>();
		Set<Character> dupCharSet = new HashSet<Character>();

		for (int i = 0; i < charArray.length; i++) {
			if (charSet.add(charArray[i]) == false) {
				dupCharSet.add(charArray[i]);
				charSet.remove(charArray[i]);
			}
		}
		System.out.println(dupCharSet);
		System.out.println(charSet);
		char ch = ' ';
		List<Character> newList = new ArrayList<Character>(charSet);
		for (int i = 0; i < charSet.size() - 1; i++) {
			if (newList.get(i).equals(ch)) {
				newList.remove(i);
			}
		}
		System.out.println(newList);

	}

}
