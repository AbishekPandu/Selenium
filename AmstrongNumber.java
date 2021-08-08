package week1.day1;

public class AmstrongNumber {

	public static void main(String[] args) {
		int number1=153;
		int number=153;
		int remainder;
		double sum = 0;
		while (number>0) {
			remainder=number%10;
			sum=sum+Math.pow(remainder,3);
			number=number/10;
}
		if (sum==number1)
		System.out.println("The number " +number1 + " is an amstrong number");
		else
			System.out.println("The number " +number1 + " is not an amstrong number");
}

}
