package week3.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortusingCollection {

	public static void main(String[] args) {

		String[] strArray = { "HCL", "Wipro", "Aspire Systems", "CTS" };
		int length = strArray.length;
		Arrays.sort(strArray);
		List<String> listSorted = new ArrayList<String>();
		for (int i = length - 1; i >= 0; i--) {
			listSorted.add(strArray[i]);
		}
		System.out.println(listSorted);
	}
}
