package javatask;

import java.util.*;

public class LeapYear {

	
public static void main(String[] args) {
		
		Scanner n = new Scanner(System.in);
		
		System.out.println("Enter a Year : ");
		int year = n.nextInt();
		
		if ( year % 4 == 0) {
			
			System.out.println(year+" It is a Leap Year ");
		} else {
			
			System.out.println(year+" It is not a Leap Year ");
		}
	}
}
