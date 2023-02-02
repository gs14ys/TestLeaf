package week3.class29thJan;

import java.util.Map;
import java.util.TreeMap;

public class FindNumberOfOccurancesUsingMap {
	public static void main(String[] args) {
		int count = 1;
		int[] arr = { 2, 3, 5, 6, 3, 2, 1, 4, 2, 1, 6, -1 };
		Map<Integer, Integer> strMap = new TreeMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (strMap.containsKey(arr[i])) {
				strMap.put(arr[i], strMap.get(arr[i]) + 1);
			} else {
				strMap.put(arr[i], 1);
			}
		}
		System.out.println(strMap);

	}
}
