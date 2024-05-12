package basic;

import java.util.Scanner;

public class postive_or_negative {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x;
		System.out.println("ente rthe value of x=");
		x = sc.nextInt();
		if(x>=0) {
			System.out.println("positive");
		}
		else {
			System.out.println("negative");
		}

	}

}
