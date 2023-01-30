package week3.assignments;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicateWords {

	public static void main(String[] args) {

		String text = "We learn java basics as part of java sessions in java week1";
		String textArray[] = text.split(" ");
		List<String> textList = new ArrayList<String>();

		for (int i = 0; i < textArray.length; i++) {
			textList.add(textArray[i]);
		}
		for (int i = 0; i < textList.size(); i++) {
			for (int j = i + 1; j < textList.size() - 1; j++) {

				if (textList.get(j).equalsIgnoreCase(textList.get(i))) {
					textList.remove(j);
				}
			}

		}
		System.out.println(textList);
	}
}
