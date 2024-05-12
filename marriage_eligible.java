package basic;

import java.util.Scanner;

public class marriage_eligible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fage, mage;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the age of female and male =");
		fage = sc.nextInt();
		mage = sc.nextInt();
		if (fage > 18 && mage > 21) {
			System.out.println("eligible for marriage");
		} else {
			System.out.println(" not eligible for marriage");
		}

	}

}
