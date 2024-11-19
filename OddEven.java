package javatask;

public class OddEven {
	
	public static void main(String[] args) {
		System.out.println("Even Numbers:");
        for (int i = 1; i <= 10; i++) {             
            if (i % 2 == 0) {                       
                System.out.println(i+" Is Even Number");
            }
        }

        System.out.println("Odd Numbers:");
        for (int i = 1; i <= 10; i++) {              
            if (i % 2 != 0) {                    
                System.out.println(i+" Is Odd Number");
            }
        }
        
	}
}
