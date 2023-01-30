package week3.assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {

	public static void main(String[] args) {
		int[] data = { 3, 2, 11, 4, 6, 7, 2, 3, 3, 6, 7 };
		Set<Integer> setData = new TreeSet<Integer>();
		for (int i = 0; i < data.length; i++) {

			setData.add(data[i]);
		}

		System.out.println(setData);
		List<Integer> dataSecondLargest = new ArrayList<Integer>(setData);
		System.out.println(dataSecondLargest.get(setData.size() - 2));

	}

}
