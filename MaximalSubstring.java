package week1.day2;

public class MaximalSubstring {

	String maximalWordString = null;

	public static void main(String[] args) {
		String givenString = "I study in TestLeaf abc";
		MaximalSubstring maximalString = new MaximalSubstring();
		System.out.println("MaximalString is: " + maximalString.maximalSubstringForCheckingCount(givenString));
	}

	public String maximalSubstringForCheckingCount(String givenString) {

		String[] splitArray = givenString.split(" ");
		for (int i = 0; i < splitArray.length - 1; i++) {

			for (int j = i + 1; j < splitArray.length; j++) {

				if (splitArray[i].length() > splitArray[j].length()) {
					maximalWordString = splitArray[i];
				} else {
					System.out.println(splitArray[i] + " is not a maximal String");
					break;
				}
				maximalWordString = splitArray[i];
			}

		}
		return maximalWordString;

	}
}
