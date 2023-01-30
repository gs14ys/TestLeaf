package week3.assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {

	public static void main(String[] args) {
		int[] num = { 1, 2, 3, 4, 5, 6, 7, 8, 10 };
		Set<Integer> numSet = new TreeSet<Integer>();
		for (int i = 0; i < num.length; i++) {
			numSet.add(num[i]);
		}
		List<Integer> listNumber = new ArrayList<Integer>(numSet);
		for (int j = 0; j < listNumber.size(); j++) {
			System.out.println(listNumber.get(j));
			if ((listNumber.get(j)) != (j + 1)) {
				System.out.println("Missing Number: " + (j + 1));
				break;
			}
		}

	}

}
