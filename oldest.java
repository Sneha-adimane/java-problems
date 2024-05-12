package basic;

import java.util.*;

public class oldest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the age = ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		if (a > b && a > c) {
			System.out.println("a is older");
		} else {
			if (b > a && b > c) {
				System.out.println("b is older");
			} else {
				System.out.println("c is older");
			}
		}

	}

}
