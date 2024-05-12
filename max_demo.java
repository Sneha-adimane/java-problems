package basic;

import java.util.Scanner;

public class max_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a, b;
		System.out.println("enter the value of two numbers =");
		a = sc.nextInt();
		b = sc.nextInt();
		if (a > b) {
			System.out.println("a is big");
		} else {
			System.out.println("b is big");
		}
	}

}
