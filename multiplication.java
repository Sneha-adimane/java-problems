package basic;

import java.util.*;

public class multiplication {

	public static void main(String[] args) {
		int n, i, x;
		System.out.print("enter the positive number:");
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		for (i = 1; i <= 10; i++) {
			x = n * i;
			System.out.println(n + "*" + i + "=" + x);
		}
	}

}
