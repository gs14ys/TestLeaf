package week1.day2;

public class HappyNumbers {

	public static boolean findingHappyNumber(int num) {
		boolean isHappyNumber = false;
		int quotient = 0;
		int remainder = 0;
		int newNumber = 0;
		int length = Integer.toString(num).length();
		while (length != 0) {
			System.out.println(Integer.toString(num).length());
			quotient = num / 10;
			System.out.println("quotient: " + quotient);
			remainder = num % 10;
			System.out.println("remainder: " + remainder);
			newNumber = (int) (newNumber + Math.pow(remainder, 2));
			System.out.println("newNumber: " + newNumber);
			if (quotient == 1 && length != 0 && newNumber != 1) {
				System.out.println("Inside first if: ");
				num = quotient;
				length--;
				System.out.println("original number: " + num + "length" + length);
				continue;

			} else if (quotient == 0 && length != 0 && newNumber != 1) {
				System.out.println("Inside 2nd if: ");
				num = newNumber;
				newNumber = 0;
				length = Integer.toString(num).length();
				System.out.println("original number: " + num + "length" + length);
				continue;
			} else if (quotient != 1 && length != 0 && newNumber != 1) {
				System.out.println("Inside 3rd if: ");
				num = quotient;
				length--;
				length = Integer.toString(num).length();
				System.out.println("original number: " + num + "length" + length);
				continue;

			} else if (quotient == 0 && length == 1 && newNumber == 1) {
				System.out.println("Inside 4th if: ");
				isHappyNumber = true;
				System.out.println("congrats we have got the number" + length);
				break;
			}

		}
		return isHappyNumber;
	}

	public static void main(String[] args) {
		if (HappyNumbers.findingHappyNumber(18) == true) {
			System.out.println("Happy numbers");
		}
	}
}
