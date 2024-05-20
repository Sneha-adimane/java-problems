package basic;

import java.util.*;

public class power {

	public static void main(String[] args) {
		int a, b, x = 1;
		System.out.print("enter the two numbers:");
		Scanner s = new Scanner(System.in);
		a = s.nextInt();
		b = s.nextInt();
		if(b>=1) {
			for (int i = 1; i <= b; i++) {
				x = x * a;
			}
		System.out.println(x);
		}
	}

}
