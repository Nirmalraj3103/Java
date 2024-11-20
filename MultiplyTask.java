package javatask;

import java.util.*;

public class MultiplyTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number ");
		int num = sc.nextInt();
		
		if ( num % 2 == 0 ) {
			System.out.println(num+" is a multiple of 2 ");
		} else {
			System.out.println(num+" is not a multiple of 2 ");
		}
		


	}

}
