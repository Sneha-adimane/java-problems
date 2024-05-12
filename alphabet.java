package basic;
import java.util.*;

public class alphabet {

	public static void main(String[] args) {
		char x;
		Scanner sc = new Scanner(System.in);
		System.out.println("enther tha alphabet=");
		x = sc.next().charAt(0);
		if (x =='a' || x =='e' || x =='i' || x =='o' || x =='u') {
			System.out.println("it is vowel");
		} else {
			System.out.println("it is consonant");
		}

	}

}
