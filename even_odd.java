package basic;

public class even_odd {

	public static void main(String[] args) {
		int i, sum = 0;
		for (i = 0; i <= 10; i++) {
			if (i % 2 == 0) {
				sum = sum + i;
			}
		}
		System.out.println("sum of even number is:" + sum);
		sum=0;
		for (i = 0; i <= 10; i++) {
			if (i % 2 != 0) {
				sum = sum + i;
			}
		}
		System.out.println("sum of odd number is:" + sum);

	}

}
