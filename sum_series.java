package basic;

import java.util.*;

public class sum_series {

	public static void main(String[] args) {
		float i,n,sum=0;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		for(i=1;i<=n;i++) {
			sum = (1/i)+sum;
		}
		System.out.println(sum);
	}

}
