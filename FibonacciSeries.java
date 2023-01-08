package week1.day1;

public class FibonacciSeries {

	public static void fibonacciMethod() {
		int firstNum = 0;
		int secondNum = 1;
		int sum = 0;
		System.out.print(firstNum + " " + secondNum + " ");

		for (int i = 1; i <= 11; i++) {
			sum = firstNum + secondNum;
			firstNum = secondNum;
			secondNum = sum;
			System.out.print(sum + " ");
		}
	}

	public static void main(String[] args) {
		FibonacciSeries.fibonacciMethod();
	}
}
