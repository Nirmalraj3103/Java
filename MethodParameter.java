//write a program to add two numbers using method parameters

package javatask;
import java.util.*;


public class MethodParameter {
	static void addNumbers(int a,int b) {
		int c = a+b;
		System.out.println("The sum of " +a+" and " +b+ " is: " +c);
		
	}
	
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		
		int a;
		System.out.println("Enter A value");
		a=obj.nextInt();
		System.out.println("The value of A :"+a);
		
		int b;
		System.out.println("Enter B value");
		b=obj.nextInt();
		System.out.println("The value of B :"+b);
		
		addNumbers(a,b);
		addNumbers(5,15);
		addNumbers(10,20);
		
	
	}

}
