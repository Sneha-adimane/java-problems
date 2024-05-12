package basic;
import java.util.*;
public class basic_salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float b_sal,G_sal;
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the basic salary:");
		b_sal = sc.nextFloat();
		if (b_sal >= 10000) {
			G_sal = b_sal + b_sal * 40 / 100 + b_sal * 30 / 100;
			System.out.println("gross salary is:" + G_sal);
		} else {
			G_sal = b_sal + b_sal * 30 / 100 + b_sal * 20 / 100;
			System.out.println("gross salary is:" + G_sal);
		}

	}

}
