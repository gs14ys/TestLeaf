package week1.day1;

public class primeNumber {

	public static boolean isPrime(int num) {
		boolean isPrimeNumber = false;
		for (int i = 2; i <= num; i++) {
			if (num % i == 0 && num != i) {
				isPrimeNumber = false;
				break;
			} else {
				isPrimeNumber = true;
			}

		}
		return isPrimeNumber;
	}

	public static void main(String[] args) {
		int num = 13;

		if (primeNumber.isPrime(num) == true) {
			System.out.println("it is prime number");
		} else if (num == 1) {
			System.out.println("it is not a prime number");

		} else {
			System.out.println("it is not a prime number");
		}
	}
}
