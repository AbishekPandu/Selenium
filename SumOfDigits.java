package week1.day1;

public class SumOfDigits {

	public static void main(String[] args) {
		int number = 1234;
		int number1 = 1234;
		int sum = 0;
		int remainder;
		while (number > 0) {
			remainder = number % 10;
			sum = sum + remainder;
			number = number / 10;
		}
		System.out.println("Sum of digit "  + number1+ " is: " + sum);
	}
}
