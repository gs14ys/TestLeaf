package week2.day2;

public class Assignment7 {

	public static boolean findIfRepeated() {
		int arr[] = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };
		boolean isRepeated = false;
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = arr.length - 1; j >= 0; j--) {
				if (arr[i] == arr[j]) {
					count = count + 1;
				}
			}
			if (count >= 2) {
				isRepeated = true;
				break;
			} else {
				isRepeated = false;
				count = 0;
			}
		}
		return isRepeated;
	}

	public static void main(String[] args) {
		System.out.println(Assignment7.findIfRepeated());
	}

}
