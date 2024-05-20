package basic;
import java.util.*;

public class triangle {

	public static void main(String[] args) {
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		if(a==b && b==c) {
			System.out.println("equilateral triangle");
		}
		else {
			if (a==b || b==c || c==a) {
				System.out.println("isosceles triangle");
			}
			else {
				System.out.println("scalene triangle");
			}
		}

	}

}
