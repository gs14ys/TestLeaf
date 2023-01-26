package week2.day2;

public class Assignment10 {
	String jewels = "aA";
	String stones = "aAAbbbb";
	int count = 0;
	int indexValueForUniqueElement = -2;

	public int stringJewels() {
		char jewelsArray[] = this.jewels.toCharArray();
		char stonesArray[] = this.stones.toCharArray();

		for (int i = 0; i < jewelsArray.length; i++) {
			for (int j = 0; j < stonesArray.length; j++) {
				if (jewelsArray[i] == stonesArray[j]) {
					count++;
					System.out.println("cannot find unique char:" + count);
				}
			}

		}
		return count;

	}

	public static void main(String[] args) {
		Assignment10 assign = new Assignment10();
		System.out.println(assign.stringJewels());
	}

}
