package javaTask;

import java.util.Scanner;

public class PerfectTriangle{
	
	
		public static void main(String[] args) {
			
			int i,j;
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Number of Rows : ");
			int rows = sc.nextInt();
			
			for (i=1;i<=rows;i++) {							
				
				for (j=rows;j>=i;j--) {						
					System.out.print(" ");
				}
				
				for (j=1;j<=i;j++) {							 
					System.out.print("* ");
				}
				
				System.out.println();
			}
		}

}
