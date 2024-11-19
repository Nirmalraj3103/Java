package javatask;

import java.util.*;

public class CreateTable {
	
	public static void main(String[] args) {
		
        System.out.println("Enter the table number: ");
		
		Scanner n = new Scanner(System.in);
		int num = n.nextInt();
		
		for(int i=1; i<= 10; i++) {
			System.out.println(i + " x "+ num +" = "+ (i*num));
		}

		
	}
}
