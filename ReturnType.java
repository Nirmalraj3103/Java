// write a program to add two numbers using return type

package javatask;
import java.util.*;
public class ReturnType {
	
	static int addNumbers(int a,int b) {
		int c= a + b;
		return c;
	
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
		
		int c=addNumbers(a,b);
		System.out.println("the result value is"+" "+c);
		
	
	}
	
}
