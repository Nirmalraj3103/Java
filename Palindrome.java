package javatask;
import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
		int num = sc.nextInt();
		
		int real = num;
		int reverse = 0;
	
		//Reverse the num
		while ( num != 0 ) {
			int mod = num % 10;
			reverse = reverse * 10 + mod;
			num = num / 10;
		}
		
		if ( reverse == real ) {
			System.out.println(real+" is a Palindrome ");
		} else {
			System.out.println(real+" is not a Palindrome");
		}

	}

}
