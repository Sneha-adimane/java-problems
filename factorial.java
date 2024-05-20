package basic;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		int fact = 1, n;
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number:");
		n = s.nextInt();
		for (int i = 1; i <= n; i++) {
			fact = i * fact;
		}
		System.out.println(fact);
	}

}
