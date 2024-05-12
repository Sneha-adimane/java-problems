package basic;
import java.util.*;
public class calculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pens = 70 , cost , total,x;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the cost of each pen");
		cost = sc.nextInt();
		total = pens * cost;
		System.out.println(total);
		if(total>1000) {
			x=total-total*20/100;
			System.out.println(x);	
		}else {
			x=total-total*10/100;
			System.out.println(x);
		}
		

	}

}
