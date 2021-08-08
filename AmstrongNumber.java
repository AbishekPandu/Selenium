package week1.day1;

public class AmstrongNumber {

	public static void main(String[] args) {
		int number1=371;
		int number=371;
		int remainder;
		double sum = 0;
		while (number>0) {
			remainder=number%10;
			sum=sum+Math.pow(remainder,3);
			number=number/10;
}
		if (sum==number1)
		System.out.println("The number is amstrong number");
		else
			System.out.println("The number is not an amstrong number");
}

}
