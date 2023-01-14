package week1.day2;

import java.util.Arrays;

public class FindTheNumberWithSingleInstance {

	public static void main(String[] args) {
		System.out.println(FindTheNumberWithSingleInstance.findNumberFromArray() + "final");
	}

	public static int findNumberFromArray() {
		int thatNumber = 0;
		int[] arrayOfInt = { 1, 4, 2, 2, 1 };
		Arrays.sort(arrayOfInt);

		for (int i = 0; i < arrayOfInt.length; i++) {
			int count = 0;
			for (int j = i + 1; j < arrayOfInt.length - 1; j++) {
				System.out.println(i + " " + j);
				System.out.println(arrayOfInt[i] + " " + arrayOfInt[j]);
				if (arrayOfInt[i] == arrayOfInt[j]) {
					count = count + 1;
					System.out.println(i + " inside if loop index value " + j + "count: " + count);
					System.out.println(arrayOfInt[i] + " " + arrayOfInt[j]);
					break;
				}

			}
			if (count == 0) {
				thatNumber = arrayOfInt[i];
				System.out.println(i);
				System.out.println(arrayOfInt[i]);
			}
		}
		return thatNumber;
	}
}
