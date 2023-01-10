package week1.day2;

public class MaximalSubstring {

	public static void main(String[] args) {
		String givenString = "Indians study in FreeTime";
		MaximalSubstring maximalString = new MaximalSubstring();
		System.out.println("MaximalString is: " + maximalString.maximalSubstringForCheckingCount(givenString));
	}

	String finalValue = null;

	public String maximalSubstringForCheckingCount(String givenString) {
		String[] splitArray = givenString.split(" ");
		for (int i = 0; i < splitArray.length; i++) {
			String maximalWordString = null;

			for (int j = 0; j < splitArray.length; j++) {

				if (splitArray[i].length() >= splitArray[j].length()) {
					maximalWordString = splitArray[i];
				} else {
					System.out.println(splitArray[i] + " is not a maximal String");
					maximalWordString = null;
					break;
				}
				System.out.println(maximalWordString + " innerLoop");
			}
			if (maximalWordString != null) {
				finalValue = maximalWordString;
				System.out.println(finalValue + " outerLoop");
				break;
			}
		}
		return finalValue;

	}
}
