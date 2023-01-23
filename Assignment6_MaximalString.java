package week2.day2;

public class Assignment6_MaximalString {

	public static void findMaximalString() {
		int arr[] = { 3, 2, 3 };
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count = count + 1;
				}
			}
			if (count > (arr.length / 2)) {
				System.out.println("Maximal String is:" + arr[i]);
				break;
			}
		}
	}

	public static void main(String[] args) {
		Assignment6_MaximalString.findMaximalString();
	}

}
